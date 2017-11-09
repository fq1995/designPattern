package com.fu.factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// ��ȡCircle �Ķ��󣬲�����draw ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// ����Circle ��draw����
		shape1.draw();

		//ͨ�������ȡ
		Circle cir = (Circle) ShapeFactory.getClass(Circle.class);
		// ����Circle ��draw����
		cir.draw();

		// ��ȡRectangle �Ķ��󣬲�����draw ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ����Rectangle ��draw����
		shape2.draw();

		// ��ȡRectangle �Ķ��󣬲�����draw ����
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ����Rectangle ��draw����
		shape3.draw();
	}
}
