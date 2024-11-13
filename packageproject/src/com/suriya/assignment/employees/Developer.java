package com.suriya.assignment.employees;

public class Developer extends Employee {
	private String position;

	public Developer(String name,int employeeid,long salary,String position) {
		super(name,employeeid,salary);
		this.position=position;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
