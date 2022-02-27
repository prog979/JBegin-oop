package edu.jbegin.oop.robot;

public abstract class RobotProperties implements Robot {

	private String name;

	private Wing wing;

	public RobotProperties() {
	}

	public RobotProperties(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wing getWing() {
		return wing;
	}

	public void setWing(Wing wing) {
		this.wing = wing;
	}

	public abstract void talk();

	@Override
	public void move() {
		System.out.println("move");

	}

	@Override
	public void stop() {
		System.out.println("stop");

	}

	@Override
	public void fly() {
		System.out.println("fly");

	}

}
