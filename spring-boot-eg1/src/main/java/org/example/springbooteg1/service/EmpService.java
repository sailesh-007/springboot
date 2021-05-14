package org.example.springbooteg1.service;

import org.example.springbooteg1.model.Emp;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    
     public Emp getDummyEmp(){
         return new Emp(1,24,"vishwa","developer");
     }

    public Emp getDummyEmpById(String id){
        return new Emp(Integer.valueOf(id),24,"vishwa","developer");
    }

    public boolean addEmp(Emp emp){
         System.out.println("Added employee "+emp);
         return true;
    }
}
