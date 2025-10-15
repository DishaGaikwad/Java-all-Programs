package com.day9.service;

import java.util.List;

import com.day9.beans.Employee;

public interface EmployeeService {
	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);

	boolean updateById(int eid, double sal);

	boolean deleteBySalary(double sal);

	List<Employee> searchBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();
}
