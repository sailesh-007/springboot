package com.example.springjparest.service;

import com.example.springjparest.entity.Emp;
import com.example.springjparest.model.EmpDto;

import java.util.List;

public interface EmpService {
    List<EmpDto> getAllEmps();
    EmpDto getEmpById(Long id);
    boolean createEmp(EmpDto empDto);
}
