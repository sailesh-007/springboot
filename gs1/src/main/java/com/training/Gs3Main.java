package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Gs3Main {

    public static void main(String args[]) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\springbootgit\\gs1\\src\\main\\resources\\gs3.xml");
        Emp hb = (Emp) ctx.getBean("emp");
        System.out.println(hb);
    }

}
