package com.example.scsx_back.service.impl;

import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.entities.Cf_problem;
import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.mapper.CfMapper;
import com.example.scsx_back.service.CfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CfServiceImpl implements CfService {

    @Autowired
    CfMapper cfMapper;

    /**
     * 分页返回比赛信息
     * @return
     */
    @Override
    public PageBean cf_contest_list(int page , int pagesize) {
        //1. 获取总记录数
        Long count = cfMapper.count();
        //2. 获取分页查询结果列表
        int start = (page - 1) * pagesize;
        List<Ac_contest> AcContestList = cfMapper.contest_page(start, pagesize);
        //3. 封装PageBean对象
        PageBean pageBean = new PageBean(count, AcContestList);
        return pageBean;
    }

    @Override
    public List<Cf_problem> cf_problem_list(int cid) {
         List<Cf_problem> problem_list = cfMapper.problem_list(cid);
         return problem_list;
    }


}
