package com.example.springjparest.service;

import com.example.springjparest.entity.Emp;
import com.example.springjparest.model.EmpDto;
import com.example.springjparest.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DbEmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Override
    public List<EmpDto> getAllEmps() {
        List<EmpDto> empList =  new ArrayList<>();
        for(Emp e : empRepository.findAll()){
            EmpDto empDto =  new EmpDto();
            empDto.setEmpId(e.getId());
            empDto.setAge(e.getAge());
            empDto.setFirstName(e.getFirstName());
            empDto.setLastName(e.getLastName());
            empDto.setTitle(e.getTitle());
            empDto.setSalary(e.getSalary());
            empList.add(empDto);
        }

        return empList;
    }

    @Override
    public EmpDto getEmpById(Long id) {
        Optional<Emp> optional = empRepository.findById(id);
        EmpDto empDto =  new EmpDto();
        if (optional.isPresent()){
            Emp e = optional.get();
            empDto.setEmpId(e.getId());
            empDto.setAge(e.getAge());
            empDto.setFirstName(e.getFirstName());
            empDto.setLastName(e.getLastName());
            empDto.setTitle(e.getTitle());
            empDto.setSalary(e.getSalary());
        }
        return empDto;

    }

    @Override
    public boolean createEmp(EmpDto empDto) {

        Emp e =  new Emp();
        e.setId(empDto.getEmpId());
        e.setAge(empDto.getAge());
        e.setFirstName(empDto.getFirstName());
        e.setLastName(empDto.getLastName());
        e.setTitle(empDto.getTitle());
        e.setSalary(empDto.getSalary());
        empRepository.save(e);
        return true;
    }
}
