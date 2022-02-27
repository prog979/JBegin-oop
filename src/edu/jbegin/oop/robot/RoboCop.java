package edu.jbegin.oop.robot;

public class RoboCop extends RobotProperties {

	private String name;
	private Wing wing;

	@Override
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Wing getWing() {
		return wing;
	}

	public void setWing(Wing wing) {
		this.wing = wing;
	}

	@Override
	public void talk() {
		System.out.println("I'm RoboCop");

	}


	@Override
	public void fly() {
		getWing().open();
		System.out.println("flying with Wind size " + wing.getSize());
		super.fly();
	}

}
