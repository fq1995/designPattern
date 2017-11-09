package com.fu.singletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();

		object.setI(2);
		System.out.println(object2.getI());
		object2.setI(22);
		System.out.println(object.getI());
		
		// 显示消息
		object.showMessage();
	}
}