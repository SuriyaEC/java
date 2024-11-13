package com.tnsif.singleinheritance;

public class Student extends People{
	private int sid;
	private String clg;
	
	public Student() {
		super();
	}
	
	public Student(String name,String city,long phno,int sid,String clg) {
		super(name,city,phno);
		this.sid=sid;
		this.clg=clg;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", clg=" + clg + ",Name="+getName()+",city="+getCity()+",phno="+getPhno()+"]";
	}

}
