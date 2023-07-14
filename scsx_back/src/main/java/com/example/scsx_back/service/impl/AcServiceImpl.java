package com.example.scsx_back.service.impl;

import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.mapper.AcMapper;
import com.example.scsx_back.service.AcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcServiceImpl implements AcService {

    @Autowired
    AcMapper acMapper;

    /**
     * 分页返回比赛信息
     * @return
     */
    @Override
    public PageBean ac_contest_list(int page , int pagesize) {
        //1. 获取总记录数
        Long count = acMapper.count();
        //2. 获取分页查询结果列表
        int start = (page - 1) * pagesize;
        List<Ac_contest> AcContestList = acMapper.contest_page(start, pagesize);
        //3. 封装PageBean对象
        PageBean pageBean = new PageBean(count, AcContestList);
        return pageBean;
    }

}
