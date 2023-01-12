package com.prowings.empcrud.dao;

import com.prowings.empcrud.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(int id);

}
