package com.training.demo.service;

import com.training.demo.model.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mgrservice")
public class ManagerServiceImpl implements EmpService{
    @Override
    public Emp findEmpById(Integer id) {
        Emp emp = new Emp();
        emp.setAge((int)Math.random());
        emp.setEmpId(id.toString());
        emp.setEmpName("Manager--"+Math.random());
        return emp;
    }

    @Override
    public boolean addAllEmps(List<Emp> empList) {
        System.out.println("EmpList--->"+empList);
        return true;
    }
}
