package com.prowings.empcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prowings.empcrud.model.Employee;
import com.prowings.empcrud.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String hello()
	{
		return "hello";
	}

	@RequestMapping(value = "/employees",method = RequestMethod.POST )
	public @ResponseBody String saveEmployee(@RequestBody Employee employee)
	{
		service.saveEmployee(employee);
		
		return "sucessfully stored";
	}
	
	@GetMapping("/employees/{id}")
	public @ResponseBody Employee getEmployeeById(@PathVariable("id") int id)
	{
		return service.getEmployeeById(id);
	}
}


