package com.example.scsx_back.mapper;


import com.example.scsx_back.entities.Ac_contest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * accoder管理
 */
@Mapper
public interface AccoderMapper {

    @Select("select * from oj.ac_contest_with_participate")
    List<Ac_contest> list();

}
