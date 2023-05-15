package com.greatlearning.employeeManagementApp.service;

import java.util.List;

import com.greatlearning.employeeManagementApp.entity.Employee;
import com.greatlearning.employeeManagementApp.entity.Role;
import com.greatlearning.employeeManagementApp.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public User saveUser(User user);

	public Role saveRole(Role role);
}
