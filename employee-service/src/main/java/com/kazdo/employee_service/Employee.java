package com.kazdo.employee_service;

import java.util.List;

public class Employee {
	
	EmployeeDataService eds;
	
	public Employee(EmployeeDataService eds) {
		this.eds = eds;
	}
	
    public List<String> getEmployeeOfCareer(String career) {
    	return eds.getData();
    }
}
