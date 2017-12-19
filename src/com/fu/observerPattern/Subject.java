package com.fu.observerPattern;

/**
 * 被观察者
 * @author fu
 *
 */
public interface Subject {

	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * 移除观察者
	 */
	public void removerObserver(Observer observer);
	
	/**
	 * 通知观察者
	 */
	public void notifyObserver();
}
