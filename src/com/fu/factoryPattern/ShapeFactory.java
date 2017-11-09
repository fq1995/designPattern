package com.fu.factoryPattern;

public class ShapeFactory {

	//����getShape������ȡ��״���͵Ķ���
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
	
	//ͨ��������ƽ��ÿ����һ���������Ҫ����һ������ʵ�ֹ���
	public static Object getClass(Class<? extends Shape> clazz){
		Object obj = null;
		
		try {
			obj = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
