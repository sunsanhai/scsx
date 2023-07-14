package com.example.scsx_back.service;

import com.example.scsx_back.entities.PageBean;

public interface HomeService {
    PageBean home_list(int page , int pagesize);
}
