package com.training.config;

import com.training.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.training")
public class AppConf {

    @Bean(name = "helloBean")
    public HelloBean helloBean(){
        HelloBean hb =  new HelloBean();
        hb.setMessage("Welcome to spring");
        return hb;
    }


}
