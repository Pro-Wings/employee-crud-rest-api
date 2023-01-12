package com.prowings.empcrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.prowings.empcrud.dao.EmployeeDao;
import com.prowings.empcrud.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(employee);
		txn.commit();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Employee emp;
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		emp = session.get(Employee.class, id);
		txn.commit();
		
		return emp;
	}

}
