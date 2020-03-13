package com.epsilon.training.entity;

import java.util.logging.Logger;

public abstract class Shape {

	Logger logger = Logger.getLogger(Shape.class.getName());

	protected static double PI;

	static {
		PI = 3.1416;
	}

	// subclasses cannot override final methods
	public final void info() {
		logger.info("Classname : Shape");
		logger.info("Created by : Akshay <akshay@epsilon.com>");
	}

	
	//subclass must override abstract methods
	public abstract void printArea();
}
