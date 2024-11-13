package com.suriya.assignment;

import com.suriya.assignment.employees.*;
import com.suriya.assignment.utilities.*;

public class AssignmentDemo {

	public static void main(String[] args) {
		Employee e1=new Employee ("suriya",49,100000);
		
		Manager m1=new Manager("suriya",49,100000,"security");
		
		Developer d1=new Developer("riya",89,100000,"L1");
		
		EmployeeUtilities.printdetails(m1);
		EmployeeUtilities.increment(m1);

	}

}
