package com.example.springjparest.controller;

import com.example.springjparest.model.EmpDto;
import com.example.springjparest.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmpController {


   private final  EmpService empService;

    @PostMapping( "/addemp")
    public boolean addEmp(@RequestBody EmpDto empDto){
       return empService.createEmp(empDto);
    }

    @GetMapping("/listall")
    public List<EmpDto> listall(){
        return empService.getAllEmps();
    }

    @GetMapping("/findempbyid")
    public EmpDto findEmpById(@RequestParam Long id){
        return empService.getEmpById(id);
    }
}
