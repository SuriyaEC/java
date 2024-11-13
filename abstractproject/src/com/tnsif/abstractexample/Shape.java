package com.tnsif.abstractexample;

public abstract class Shape {
	protected float area;//allow to derived class
	
	abstract void calArea();
	
	//concrete class
	void show() {
		System.out.println("Area of shape is "+area);
	}
}