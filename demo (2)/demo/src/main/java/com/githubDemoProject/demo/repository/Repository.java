package com.githubDemoProject.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.githubDemoProject.demo.employee.Employee;



public interface Repository extends JpaRepository<Employee , Long>{
	//querry Method 
	//Optional <Employee>findEmployeeById(Long id);

}
