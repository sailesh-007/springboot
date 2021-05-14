package org.example.springbooteg1.controller;

import org.example.springbooteg1.model.Emp;
import org.example.springbooteg1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping(value="/getemp")
    public Emp getEmp(){
      return empService.getDummyEmp();
    }

    @GetMapping(value="/getempbyid")
    public Emp getEmpById(@RequestParam(name="id",defaultValue = "0") String id){
        return empService.getDummyEmpById(id);
    }

    @GetMapping(value="/getempbyidpath/{id}")
    public Emp getEmpByIdPath(@PathVariable(name = "id") String id){
        return empService.getDummyEmpById(id);
    }
    
    @PostMapping(value = "/addemp")
    public boolean addEmp(@RequestBody Emp emp){
        return empService.addEmp(emp);
    }
}
