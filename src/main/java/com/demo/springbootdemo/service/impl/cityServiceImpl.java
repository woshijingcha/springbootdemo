package com.demo.springbootdemo.service.impl;

import com.demo.springbootdemo.dao.cityMapper;
import com.demo.springbootdemo.domain.City;
import com.demo.springbootdemo.service.cityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cityServiceImpl implements cityService {

    @Autowired
    private cityMapper cityMapper;


    public City selectById(int id) {
        System.out.println("serviceimpl");
       return cityMapper.selectByPrimaryKey(id);
    }
}
