package com.suriya.assignment.utilities;

import com.suriya.assignment.employees.Employee;

public class EmployeeUtilities {
	
	public static void printdetails(Employee employee) {
		System.out.println("ID : "+employee.getEmployeeid());
		System.out.println("NAME : "+employee.getName());
		System.out.println("SALARY : "+employee.getSalary());
	}

	public static void increment(Employee employee) {
		long increasedsalary=employee.getSalary()+1000;
		employee.setSalary(increasedsalary);
	}
}