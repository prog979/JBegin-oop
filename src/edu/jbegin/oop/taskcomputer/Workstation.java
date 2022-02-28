package edu.jbegin.oop.taskcomputer;

public class Workstation implements Computer {

	private String computerName;
	private Monitor monitor;

	public Workstation() {

	}

	public Workstation(String computerName, Monitor monitor) {
		this.computerName = computerName;
		this.monitor = monitor;

	}

	@Override
	public void on() {
		System.out.println(
				"Компьютер включился " + getComputerName() + ", используется монитор: " + monitor.getMonitorName());

	}

	@Override
	public void off() {
		System.out.println(
				"Компьютер выключился " + getComputerName() + ", используется монитор: " + monitor.getMonitorName());
	}

	@Override
	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	@Override
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}
