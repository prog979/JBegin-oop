package edu.jbegin.oop.taskcomputer;

public class Main {

	public static void main(String[] args) {

		Workstation workstation = new Workstation();
		workstation.setComputerName("MacBook");
		
		CrystalMonitor crystalMonitor = new CrystalMonitor();
		crystalMonitor.setMonitorName("Samsung");
		
		workstation.setMonitor(crystalMonitor);

		workstation.on();
		workstation.off();

	}

}
