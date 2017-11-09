package com.fu.factoryPattern;

public class ShapeFactory {

	//根据getShape方法获取形状类型的对象
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
	
	//通过反射机制解决每增加一个对象就需要增加一个对象实现工厂
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
