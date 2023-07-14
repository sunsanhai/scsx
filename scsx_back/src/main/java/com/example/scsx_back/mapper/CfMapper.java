package com.example.scsx_back.mapper;

import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.entities.Cf_problem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface CfMapper {

    /**
     * 查询所有ac比赛数据
     * @return
     */
    @Select("select * from oj.cf_contest_with_participate limit #{page},#{pagesize}")
    List<Ac_contest> contest_page(int page , int pagesize);

    /**
     * 统计数据库中ac比赛数量
     */
    @Select("select count(*) from oj.cf_contest_with_participate")
    public long count();

    /**
     * 查询比赛对应题目
     */
    @Select(" select * from oj.cf_problems_with_contest_info , oj.codeforces_problems_with_tags " +
            "where oj.cf_problems_with_contest_info.cid = #{cid} " +
            "and oj.cf_problems_with_contest_info.id = oj.codeforces_problems_with_tags.id")
    public List<Cf_problem> problem_list(int cid);

}
