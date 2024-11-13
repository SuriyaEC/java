package com.tnsif.singleinheritance;

public class People {
	private String name;
	private String city;
	private long phno;
	
	public People() {
		System.out.println("people object is created");
	}
	
	public People(String name,String city,long phno) {
		this.name=name;
		this.city=city;
		this.phno=phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", city=" + city + ", phno=" + phno + "]";
	}	
	
}
