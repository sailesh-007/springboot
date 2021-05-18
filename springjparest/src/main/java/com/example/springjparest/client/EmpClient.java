package com.example.springjparest.client;

import com.example.springjparest.model.EmpDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EmpClient {

    public static void main(String args[]){
        RestTemplate restTemplate =  new RestTemplate();
       // ResponseEntity<String> rs =restTemplate.getForEntity("http://localhost:8080/listall",String.class);
       // System.out.println(rs.getBody());
        ResponseEntity<EmpDto> rs =restTemplate.getForEntity("http://localhost:8080/findempbyid?id=26", EmpDto.class);
        System.out.println(rs.getBody());
    }
}
