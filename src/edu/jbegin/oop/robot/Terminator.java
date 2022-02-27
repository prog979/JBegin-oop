package edu.jbegin.oop.robot;

public class Terminator extends RobotProperties {

	private String name;
	private Wing wing;

	@Override
	public void talk() {
		System.out.println("I'm Terminator");
	}

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

	@Override
	public void fly() {
		getWing().open();
		System.out.println("flying with Wind size " + wing.getSize());
		super.fly();
	}

}
