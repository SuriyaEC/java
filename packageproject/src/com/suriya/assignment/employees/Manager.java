package com.suriya.assignment.employees;

public class Manager extends Employee{
	private String department;

	public Manager(String name,int employeeid,long salary,String department) {
		super(name,employeeid,salary);
		this.department=department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}