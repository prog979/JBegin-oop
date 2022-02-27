package edu.jbegin.oop.robot;

public class AirWing implements Wing {

	private int size;

	@Override
	public void open() {
		System.out.println("AirWind is open!");

	}

	@Override
	public int getSize() {
		return size;

	}

	public void setSize(int size) {
		this.size = size;
	}
}
