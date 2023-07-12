package com.example.scsx_back.controller;
import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.service.AccoderService;
import lombok.extern.slf4j.Slf4j;
import com.example.scsx_back.entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/accoder")
@RestController
public class AccoderController {

    @Autowired
    private AccoderService accoderService;

    /**
     * 查询atcoder比赛数据
     */
    @GetMapping("/contest")
    public Result Get_contest(){
        List<Ac_contest> contest_list = accoderService.list();
        return Result.success(contest_list);
    }

}
