package com.training.service;

import com.training.model.Employee;

public interface EmployeeService {
    void insertEmployee(Employee emp);

    void deleteEmployeeById(String empid);
}
