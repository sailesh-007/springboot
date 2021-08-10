package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Gs6Main {

    public static void main(String args[]) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\springbootgit\\gs1\\src\\main\\resources\\gs6.xml");
        Ship hb = (Ship) ctx.getBean("ship");
        System.out.println(hb);
    }

}
