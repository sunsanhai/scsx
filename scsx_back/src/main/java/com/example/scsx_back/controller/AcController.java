package com.example.scsx_back.controller;

import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.service.AcService;
import lombok.extern.slf4j.Slf4j;
import com.example.scsx_back.entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  accoder user管理controller
 */
@Slf4j
@RequestMapping("/accoder")
@RestController
public class AcController {

    @Autowired
    private AcService acService;

    /**
     * 查询atcoder比赛数据
     */
    @GetMapping("/contest")
    public Result Get_contest(@RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "1") int pagesize){
        PageBean pageBean = acService.ac_contest_list(page,pagesize);
        return Result.success(pageBean);
    }





}
