package com.suriya.assignment.employees;

public class Employee {
	
	private String name;
	private int employeeid;
	private long salary;
	
	public Employee(String name,int employeeid,long salary) {
		this.name=name;
		this.employeeid=employeeid;
		this.salary=salary;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeid = employeeid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
