package com.prowings.empcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.empcrud.dao.EmployeeDao;
import com.prowings.empcrud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public void saveEmployee(Employee employee) {
		
		dao.saveEmployee(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

}
