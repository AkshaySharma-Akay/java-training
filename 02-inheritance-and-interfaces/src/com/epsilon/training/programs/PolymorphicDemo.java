package com.epsilon.training.programs;

import com.epsilon.training.entity.Circle;
import com.epsilon.training.entity.Shape;
import com.epsilon.training.entity.Triangle;

public class PolymorphicDemo {

	public static void main(String[] args) {

		Shape[] shapes = {
				new Triangle(1.2,4.6),
				new Triangle(1,2),
				new Circle(2.3),
				new Circle(4.5),
				new Triangle(2,4),
				new Triangle(4,5),
				new Circle(1.2)
		};
		
		for(Shape s: shapes) {
			System.out.println("----------------------------------------");
			s.printArea();
		}

	}

}
