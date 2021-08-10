package com.training.service;

import com.training.model.EmployeeHealthInsurance;

public interface HealthInsuranceService {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);
}