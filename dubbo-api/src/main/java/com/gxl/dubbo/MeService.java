package com.gxl.dubbo;

/**
 * @author gxl
 */
public interface MeService {

    /**
     * 欢迎接口
     *
     * @param name 姓名
     * @return String
     */
    String welcome(String name);
}
