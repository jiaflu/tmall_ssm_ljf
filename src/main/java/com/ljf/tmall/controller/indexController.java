package com.ljf.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lujiafeng on 2018/8/20.
 */
@Controller
@RequestMapping("")
public class indexController {

    @RequestMapping("/")
    public String index() {
        return "admin/index";
    }

}