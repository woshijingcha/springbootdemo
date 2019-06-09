package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.domain.City;
import com.demo.springbootdemo.service.cityService;
import com.demo.springbootdemo.service.impl.cityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cityController {

    @Autowired
    private cityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City slecetCity(@RequestParam(value = "id",required = true) int id){
        System.out.println("controller");
       return cityService.selectById(id);

    }
}
