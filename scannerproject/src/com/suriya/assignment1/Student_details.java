package com.suriya.assignment1;
import java.util.*;

public class Student_details {

	public static void main(String[] args) {
		
		Scanner name=new Scanner(System.in);
		String sname=name.nextLine();
		
		Scanner id=new Scanner(System.in);
		long sid=id.nextLong();
		
		Scanner grade1=new Scanner(System.in);
		char grade=grade1.next().charAt(0);
		
		Scanner percent=new Scanner(System.in);
		float percentage=percent.nextFloat();
		
		System.out.println(sname);
		System.out.println(sid);
		System.out.println(grade);
		System.out.println(percentage+"%");

	}

}
