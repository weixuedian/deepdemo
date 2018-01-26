package com.tigers.design.decorator;

/**
 * ConcreteComponent（具体被装饰对象）
 定义一个对象，可以给这个对象添加一些职责
 */
public class Man implements Person {
	@Override
	public void eat() {
		System.out.println("男人在吃");
	}
}