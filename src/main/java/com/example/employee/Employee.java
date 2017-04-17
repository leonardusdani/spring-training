package com.example.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private Integer id;
	private String name;
	private String gender;
	
	public Employee(){}
	
	public Employee(Integer id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static List<Employee> getListEmployee(){
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(new Employee(1, "Dani", "male"));
		listEmployee.add(new Employee(2, "Steven", "male"));
		listEmployee.add(new Employee(3, "Jacqueline", "female"));
		return listEmployee;
	}
	

}
