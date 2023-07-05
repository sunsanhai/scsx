import requests
from bs4 import BeautifulSoup
import openpyxl
import pymysql

# 连接数据库
conn = pymysql.connect(
    host='127.0.0.1',
    user='root',
    password='sy051333',
    database='oj'
)
cursor = conn.cursor()

# 读取student表中的ac_id
query = "SELECT ac_id FROM student"
cursor.execute(query)
ac_ids = cursor.fetchall()

# 创建Excel文件
workbook = openpyxl.Workbook()
sheet = workbook.active
sheet.append(["ac_contest", "ac_rank", "ac_performance", "ac_newRating", "ac_diff"])

# 爬取数据并写入Excel文件和数据库
for ac_id in ac_ids:
    url = f"https://atcoder.jp/user/{ac_id[0]}/history"
    response = requests.get(url, verify=False)
    soup = BeautifulSoup(response.text, 'html.parser')

    rows = soup.select(".table tbody tr")

    for row in rows:
        columns = row.select("td")

        if len(columns) >= 5:
            contest_name = columns[0].get_text()
            rank_text = columns[1].get_text()
            performance_text = columns[2].get_text()
            newRating_text = columns[3].get_text()

            # 查找最后一个td标签并获取文本内容
            diff_text = columns[-1].get_text()

            sheet.append([contest_name, rank_text, performance_text, newRating_text, diff_text])

            # 将数据存入atcoder表中
            insert_query = f"INSERT INTO atcoder(ac_id, ac_contest, ac_rank, ac_performance, ac_newRating, ac_diff) VALUES('{ac_id[0]}', '{contest_name}', '{rank_text}', '{performance_text}', '{newRating_text}', '{diff_text}')"
            cursor.execute(insert_query)

# 保存Excel文件
workbook.save("atcoder_data.xlsx")

# 提交对数据库的更改并关闭连接
conn.commit()
cursor.close()
conn.close()
