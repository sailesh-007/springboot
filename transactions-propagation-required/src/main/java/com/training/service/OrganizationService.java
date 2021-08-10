package com.training.service;

import com.training.model.Employee;
import com.training.model.EmployeeHealthInsurance;

public interface OrganizationService {
    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
