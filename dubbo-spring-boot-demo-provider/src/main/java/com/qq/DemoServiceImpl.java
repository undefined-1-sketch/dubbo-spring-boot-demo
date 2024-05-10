package com.qq;

import com.qq.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
* @description: 
* @author: rise
* @date: 2024-05-08 23:57
*/
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
