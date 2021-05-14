package com.training.demo.service;

import com.training.demo.model.Emp;

import java.util.List;

public interface EmpService {

    Emp findEmpById(Integer id);
    boolean addAllEmps(List<Emp> empList);
}
