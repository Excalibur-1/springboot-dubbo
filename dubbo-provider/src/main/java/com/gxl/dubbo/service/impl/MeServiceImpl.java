package com.gxl.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gxl.dubbo.MeService;

/**
 * @author gxl
 * @version 1.0
 * @description TODO
 * @date 2019-08-01 10:54
 */
@Service(version = "${me.service.version}")
public class MeServiceImpl implements MeService {

    @Override
    public String welcome(String name) {
        return "Hello" + name;
    }
}