package com.fu.factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取Circle 的对象，并调用draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// 调用Circle 的draw方法
		shape1.draw();

		//通过反射获取
		Circle cir = (Circle) ShapeFactory.getClass(Circle.class);
		// 调用Circle 的draw方法
		cir.draw();

		// 获取Rectangle 的对象，并调用draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// 调用Rectangle 的draw方法
		shape2.draw();

		// 获取Rectangle 的对象，并调用draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// 调用Rectangle 的draw方法
		shape3.draw();
	}
}
