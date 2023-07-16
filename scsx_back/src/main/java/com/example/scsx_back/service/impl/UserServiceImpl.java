package com.example.scsx_back.service.impl;

import com.example.scsx_back.entities.User;
import com.example.scsx_back.mapper.UserMapper;
import com.example.scsx_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> adduser(User data) {
        return null;
    }
}
