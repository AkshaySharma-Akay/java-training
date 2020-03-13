package com.epsilon.training.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Triangle extends Shape {

	Logger logger = Logger.getLogger(Triangle.class.getName());
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void printArea() {
		double area = 0.5 * base * height;
		logger.info("Area of Triangle : " + area + "sq. unit");
	}
	
	public void printTriangleInfo() {
		logger.log(Level.INFO, "Base = " + base);
		logger.log(Level.INFO, "Height = " + height);
		logger.log(Level.INFO, "Area = " + 0.5*base*height);		
	}

}
