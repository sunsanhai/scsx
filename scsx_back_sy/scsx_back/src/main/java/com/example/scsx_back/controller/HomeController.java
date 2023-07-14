package com.example.scsx_back.controller;
import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.entities.Result;
import com.example.scsx_back.service.CfService;
import com.example.scsx_back.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.example.scsx_back.entities.PageBean;
import com.example.scsx_back.service.AcService;
import lombok.extern.slf4j.Slf4j;
import com.example.scsx_back.entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  主页
 */
@Slf4j
@RequestMapping("/home")
@RestController

public class HomeController {
    @Autowired
    HomeService homeService;

    /**
     * 分页
     * @param page
     * @param pagesize
     * @return
     */
    @GetMapping("/page")
    public Result Get_home(@RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int pagesize){
        PageBean pageBean = homeService.home_list(page,pagesize);
        return Result.success(pageBean);
    }


}
