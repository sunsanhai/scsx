package com.example.scsx_back.service;

import com.example.scsx_back.entities.PageBean;


public interface AcService {

    /**
     * 分页显示比赛信息
     */
    PageBean ac_contest_list(int page , int pagesize);
}
