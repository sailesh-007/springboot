package com.training.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world from spring boot";
    }

    @RequestMapping("/hellouser")
    public String helloUser(@RequestParam String user){
        return "Hello "+user +"";
    }

    @GetMapping("/showallparams")
    public String showAllParams(@RequestParam Map<String,Object> requestParams){
    StringBuilder result= new StringBuilder("");
     for(Map.Entry<String,Object> map: requestParams.entrySet()){
         result.append(map.getKey()).append("=").append(map.getValue());
     }
    return result.toString();
    }

}
