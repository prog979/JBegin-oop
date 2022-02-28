package edu.jbegin.oop.taskcar;

public class Car implements Vechicle {

	private String name;

	public Car() {

	}

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void drive() {
		System.out.println(getName() + " drive");

	}

	@Override
	public void stop() {
		System.out.println(getName() + " stop");

	}

}
