package com.tnsif.abstractexample;

public class Square extends Shape{
	private float side;
	
	public Square() {
		this.side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;
	}
}