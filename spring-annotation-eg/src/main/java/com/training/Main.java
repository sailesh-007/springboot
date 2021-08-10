package com.training;

import com.training.config.AppConf;
import com.training.service.HiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public  static  void main(String args[]){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
        System.out.println("Ctx loaded");
       /* HelloBean bean =  (HelloBean) ctx.getBean("helloBean");
        System.out.println(bean.getMessage());
        HiService hiService =  ctx.getBean(HiService.class);
        hiService.printHi();*/
        HiService hiService = ctx.getBean(HiService.class);
        hiService.printMessageFromHellobean();


    }
}
