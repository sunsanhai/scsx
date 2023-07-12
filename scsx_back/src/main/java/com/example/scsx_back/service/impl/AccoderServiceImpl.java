package com.example.scsx_back.service.impl;

import com.example.scsx_back.entities.Ac_contest;
import com.example.scsx_back.mapper.AccoderMapper;
import com.example.scsx_back.service.AccoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccoderServiceImpl implements AccoderService {

    @Autowired
    AccoderMapper accoderMapper;

    @Override
    public List<Ac_contest> list() {
        return accoderMapper.list();
    }


}
