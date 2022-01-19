package com.githubDemoProject.demo.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.githubDemoProject.demo.employee.Employee;
import com.githubDemoProject.demo.exception.UserNotFoundException;
import com.githubDemoProject.demo.repository.Repository;
@Service
@Transactional
public class EmployeeService {
	
	private final Repository employeeRepository;
	
	@Autowired
	public EmployeeService(Repository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	
	
	public Employee addEmployee(Employee employee) {
		employee.setEmpolyeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
	
	public List <Employee> findAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee findEmployeeById (Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id" +id+"was not found"));
	}
	
	public void deleteEmployee (Long id) {
		employeeRepository.deleteById(id);
	}
}
