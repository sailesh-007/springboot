package com.training.service;

import com.training.HelloBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HiService implements InitializingBean, DisposableBean {
    
    @Autowired
    HelloBean helloBean;

    public void printHi(){
        System.out.println("Hi ---->");
    }

    public void printMessageFromHellobean(){
        System.out.println(helloBean.getMessage());
    }

    @Override
    public void destroy() throws Exception {
        System.out.print("Before destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print("After bean created");
    }
}
