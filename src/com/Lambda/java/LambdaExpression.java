package com.Lambda.java;



interface  Shape{       //Create Interface
	void draw();        //Abstract method()
}

/*
class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
		
	}
	
}


class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Squre class : draw() method");
		
	}
		
}


class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle class : draw() method");
	}
	
}

*/
public class LambdaExpression {

	public static void main(String[] args) {
		
	/*	
	Shape rectangle= () -> System.out.println("Rectangle class : draw() method");
		
	//	rectangle.draw();
		
		
		//	Shape rectangle= () -> System.out.println("Rectangle class : draw() method");

		

		
		Shape square = () -> System.out.println("Squre class : draw() method");
			
		
		square.draw();
			
		
		
		Shape circle= ()-> System.out.println("Circle class : draw() method");
		
		circle.draw();
		
		*/
		// Lambda Creation
		print(()-> System.out.println("Rectangle class : draw() method"));
		print( () -> System.out.println("Squre class : draw() method"));
		print( ()-> System.out.println("Circle class : draw() method"));
		
			}

	private static void print(Shape shape) {
		shape.draw();   //Calling method()  Shape is parent class
	}
}
