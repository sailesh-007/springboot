package com.training.dao;

import com.training.model.Employee;

public interface EmployeeDao {
    void insertEmployee(Employee cus);

    void deleteEmployeeById(String empid);
}
