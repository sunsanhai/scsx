package com.example.scsx_back.service.impl;

import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.entities.Home;
import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.mapper.CfMapper;
import com.example.scsx_back.mapper.HomeMapper;
import com.example.scsx_back.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    HomeMapper homeMapper;

    /**
     * 分页返回信息
     * @return
     */
    @Override
    public PageBean home_list(int page , int pagesize) {
        //1. 获取总记录数
        Long count = homeMapper.count();
        //2. 获取分页查询结果列表
        int start = (page - 1) * pagesize;
        List<Home> HomeList = homeMapper.contest_page(start, pagesize);
        //3. 封装PageBean对象
        PageBean pageBean = new PageBean(count, HomeList);
        return pageBean;
    }
}
