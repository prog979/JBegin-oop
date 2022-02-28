package edu.jbegin.oop.taskcomputer;

public class CrystalMonitor implements Monitor {

	private String monitorName;

	public CrystalMonitor() {
	}

	@Override
	public String getMonitorName() {
		return monitorName;
	}

	public void setMonitorName(String monitorName) {
		this.monitorName = monitorName;
	}

}
