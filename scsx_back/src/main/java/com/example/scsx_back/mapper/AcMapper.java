package com.example.scsx_back.mapper;


import com.example.scsx_back.entities.Ac_contest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * accoder管理
 */
@Mapper
public interface AcMapper {

    /**
     * 查询所有ac比赛数据
     * @return
     */
    @Select("select * from oj.ac_contest_with_participate limit #{page},#{pagesize}")
    List<Ac_contest> contest_page(int page , int pagesize);

    /**
     * 统计数据库中ac比赛数量
     */
    @Select("select count(*) from oj.ac_contest_with_participate")
    public long count();



}
