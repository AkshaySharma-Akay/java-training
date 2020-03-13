package com.epsilon.training.assignment.second;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {}
	public Circle(double r) {
		this.radius = r;
	}
	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}
	public double getArea() {
		return Math.PI * this.radius *this.radius;
	}	
}
