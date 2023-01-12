package com.prowings.empcrud.service;

import com.prowings.empcrud.model.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(int id);

}
