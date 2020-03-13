package com.epsilon.training.programs;

import com.epsilon.training.entity.Shape;
import com.epsilon.training.entity.Triangle;

public class PrintShapeArea {

	public static void main(String[] args) {

		// A variable of type Shape
		Shape s1;

		// object of a Shape type
		// s1 = new Shape() // error as Shape is an abstract class

		// up-casting : implicit
		s1 = new Triangle(12.5, 45.6);

		s1.info();
		s1.printArea();
		// s1.printTriangleInfo(); // a child class function, cannot be invoked using
		// the super class
		// as s1 is an instanceof Triangle
		// we can assign it back to another Triangle Reference

		if (s1 instanceof Triangle) {
			Triangle t1;
			t1 = (Triangle) s1; // down-casting and not implicit
			// it is possible, this kind of casting may fail at the runtime.

			t1.printTriangleInfo();
			System.out.println("s1==t1 is" + (s1 == t1));
		}
	}

}
