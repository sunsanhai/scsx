package com.example.scsx_back.controller;

import com.example.scsx_back.entities.*;
import com.example.scsx_back.service.CfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.scsx_back.entities.PageBean;
import lombok.extern.slf4j.Slf4j;
import com.example.scsx_back.entities.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *  codeforce user管理controller
 */
@Slf4j
@RequestMapping("/codeforce")
@RestController
public class CfController {
    @Autowired

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
    @GetMapping("/contestproblem")
    public Result Get_problem(int cid){
        List<Cf_problem> problem_list = cfService.cf_problem_list(cid);
        return Result.success(problem_list);
    }



}
