package com.example.scsx_back.service;

import com.example.scsx_back.entities.Cf_problem;
import com.example.scsx_back.entities.PageBean;

import java.util.List;

public interface CfService {


    PageBean cf_contest_list(int page , int pagesize);

    /**
     * 比赛问题列表
     */
    List<Cf_problem> cf_problem_list(int cid);

}
