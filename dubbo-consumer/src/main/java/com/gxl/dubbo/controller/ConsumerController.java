package com.gxl.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gxl.dubbo.MeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gxl
 * @version 1.0
 * @description TODO
 * @date 2019-08-01 11:03
 */
@RestController
@RequestMapping("/dubbo")
public class ConsumerController {

    @Reference(version = "${me.service.version}")
    private MeService meService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return meService.welcome(name);
    }
}
