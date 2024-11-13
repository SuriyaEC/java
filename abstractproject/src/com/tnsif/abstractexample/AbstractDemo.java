package com.tnsif.abstractexample;

public class AbstractDemo {

	public static void main(String[] args) {
		Square s=new Square(7);
		Rectangle r=new Rectangle();
		
		s.calArea();
		s.show();
		r.calArea();
		r.show();
	}

}
