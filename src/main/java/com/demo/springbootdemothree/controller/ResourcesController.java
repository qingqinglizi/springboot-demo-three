package com.demo.springbootdemothree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Lee
 * @Date 2020/6/12 16:23
 * @Description:
 */
@Controller
@RequestMapping("/resource")
public class ResourcesController {

    @RequestMapping("/resource1")
    public String getResource1() {
        return "resource1";
    }
}
