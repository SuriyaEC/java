package com.tnsif.singleinheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Student s1=new Student("suriya","chennai",12345678,101,"IFET Clg");
		Student s2=new Student("riya","",12345,103,"clg");
		Student s3=new Student();
		System.out.println(s3);
		System.out.println(s1 );
		System.out.println(s2 );

	}

}
