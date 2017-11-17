package com.chen.controller;


import com.chen.entity.AppointmentUser;
import com.chen.service.AppointmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentUserService appUserService;

    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List users(){
        List<AppointmentUser> list = appUserService.getList();
        return list;
    }



}
