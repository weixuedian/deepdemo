package com.tigers.design.decorator;

/**
 * Decorator（装饰者抽象类）
 * 维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
 */
public abstract class Decorator implements Person {

	protected Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public void eat() {
		person.eat();
	}
}