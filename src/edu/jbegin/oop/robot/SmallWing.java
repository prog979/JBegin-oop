package edu.jbegin.oop.robot;

public class SmallWing implements Wing {

	private int size;



	@Override
	public void open() {
		System.out.println("Small wing open");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;

	}

	public void setSize(int size) {
		this.size = size;
	}

}
