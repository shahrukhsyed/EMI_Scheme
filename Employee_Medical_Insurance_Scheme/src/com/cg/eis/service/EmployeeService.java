package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAOImpl;

public class EmployeeService implements EmployeeServiceInterface{

	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	
	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(emp);
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.findEmployee(id);
		}

	@Override
	public Map<Integer, Employee> getAllAccount() {
		// TODO Auto-generated method stub
		return dao.printEmpDetails();
	}
}
