package edu.jbegin.oop.robot;

public class Main {

	public static void main(String[] args) {

		RoboCop roboCop = new RoboCop();
		AirWing airWindRobo = new AirWing();
		airWindRobo.setSize(300);
		roboCop.setWing(airWindRobo);

		Terminator terminator = new Terminator();
		SmallWing airWingTerm = new SmallWing();
		airWingTerm.setSize(100);
		terminator.setWing(airWingTerm);

		roboCop.setName("roboCop");

		System.out.print(roboCop.getName() + " say: ");

		roboCop.talk();
		roboCop.move();
		roboCop.fly();
		roboCop.stop();

		terminator.setName("terminator");

		System.out.print("\n" + terminator.getName() + " say: ");

		terminator.talk();
		terminator.move();
		terminator.fly();
		terminator.stop();

	}

}
