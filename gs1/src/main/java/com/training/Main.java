package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String args[]){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\springbootgit\\gs1\\src\\main\\resources\\gs1.xml");
      HelloBean hb = (HelloBean)   ctx.getBean("helloBean");
      System.out.println(hb.getMessage());
    }

}
