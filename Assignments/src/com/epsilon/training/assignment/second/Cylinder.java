package com.epsilon.training.assignment.second;

public class Cylinder extends Circle {
	private double height = 1.0;
	public Cylinder(){}
	public Cylinder(double radius, double height) {
		setRadius(radius);
		this.height = height;
	}
	public Cylinder(double radius, double height, String color) {
		setRadius(radius);
		setColor(color);
		this.height = height;
	}
	
	public double getVolume() {
		double volume; //pi*r^2*h
		volume = super.getArea() * this.height;
		return volume;
	}
}
