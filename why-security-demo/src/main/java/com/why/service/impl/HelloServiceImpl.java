package com.why.service.impl;

import com.why.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * ClassName: HelloServiceImpl
 * Description: TODO
 * Date: 2019-05-31 23:45
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "hello " + name;
    }
}
