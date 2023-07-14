package com.example.scsx_back.controller;

import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.entities.Result;
import com.example.scsx_back.service.CfService;
import org.springframework.web.bind.annotation.*;


import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.service.AcService;
import lombok.extern.slf4j.Slf4j;
import com.example.scsx_back.entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  codeforce user管理controller
 */
@Slf4j
@RequestMapping("/cfcoder")
@RestController
public class CfController {

    CfService cfService;

    /**
     * 分页查询比赛
     * @param page
     * @param pagesize
     * @return
     */
    @GetMapping("/contest")
    public Result Get_contest(@RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int pagesize){
        PageBean pageBean = cfService.cf_contest_list(page,pagesize);
        return Result.success(pageBean);
    }

    /**
     * 搜索比赛的对应题目
     */
    @GetMapping("/contestproblem/{id}")
    public Result Get_problem(){
        return null;
    }



}
