package com.githubDemoProject.demo.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String name;
	private String email;
	private String job;
	private String phone;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	public Employee() {
		
	}
	public Employee(long id, String name, String email, String job, String phone, String imageUrl, String employeeCode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.job = job;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getEmpolyeeCode() {
		return employeeCode;
	}
	public void setEmpolyeeCode(String empolyeeCode) {
		this.employeeCode = empolyeeCode;
	}
	
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", email=" + email + ", job=" + job + ", phone=" + phone
				+ ", imageUrl=" + imageUrl + ", empolyeeCode=" + employeeCode + "]";
	}
	
	
	
	
	
	

}
