package com.example.scsx_back.service;

import com.example.scsx_back.entities.Ac_contest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccoderService {
    /**
     * 显示比赛信息
     */
    List<Ac_contest> list();
}
