package com.training.demo.controller;

import com.training.demo.model.Emp;
import com.training.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {


   // @Qualifier("empservice")
    @Autowired
    EmpService empService;

    @GetMapping("/findempbyid")
    public Emp findEmpById(@RequestParam Integer id){
        return empService.findEmpById(id);
    }

    @PostMapping("/addallemps")
    public boolean addAllEmps(@RequestBody List<Emp> employees){
        return empService.addAllEmps(employees);
    }

}
