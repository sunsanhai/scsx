package com.example.scsx_back.mapper;

import com.example.scsx_back.entities.Home;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HomeMapper {
    @Select("select A.id,A.realname,A.classname,A.year,ac_rating,ac_participate_time,ac_solve,ac_after,cf_rating,cf_participate_time,cf_solve,cf_after from\n" +
            "((select normal_user.id,normal_user.realname,normal_user.classname,normal_user.year,rating as ac_rating,participate_time as ac_participate_time,solve as ac_solve,after as ac_after\n" +
            "       from normal_user left join ac_account_total_info on normal_user.id=ac_account_total_info.id)A\n" +
            "left join\n" +
            "(select normal_user.id,normal_user.realname,normal_user.classname,normal_user.year,rating as cf_rating,participate_time as cf_participate_time,solve as cf_solve,after as cf_after\n" +
            "from normal_user left join cf_account_total_info on normal_user.id=cf_account_total_info.id)B\n " +
            "on A.id=B.id) \n" +
            "limit #{page},#{pagesize}")
    List<Home> contest_page(int page , int pagesize);

    @Select("select count(*) from oj.normal_user")
    long count();

//    @Select("select nu.id as id ,\n" +
//            "            nu.realname as realname ,\n" +
//            "            nu.classname as classname ,\n" +
//            "            nu.year as year ,\n" +
//            "            ca.rating as cf_rating,\n" +
//            "            ca.participate_time as cf_paticipate_time,\n" +
//            "            ca.solve as cf_solve,\n" +
//            "            ca.after as ac_after,\n" +
//            "            aa.rating as ac_rating,\n" +
//            "            aa.participate_time as ac_paticipate_time,\n" +
//            "            aa.solve as ac_solve ,\n" +
//            "            aa.after as ac_after\n" +
//            "            from normal_user nu\n" +
//            "                left join cf_account_total_info ca on nu.id = ca.id\n" +
//            "                 left join ac_account_total_info aa on ca.id = aa.id\n" +
//            "            limit #{page},#{pagesize}")
//    List<Home> contest_page(int page , int pagesize);

}
