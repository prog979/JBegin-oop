package edu.jbegin.oop.city;

import java.util.ArrayList;
import java.util.List;

public class FlatR implements Flat {

	private int number;
	private List<Resident> residentList = new ArrayList<>();

	public FlatR() {
	}

	public FlatR(int number) {
		this.number = number;
	}

	@Override
	public int getNumberFlat() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public List<Resident> getResidentList() {
		return residentList;
	}

	public void setResidentList(List<Resident> residentList) {
		this.residentList = residentList;
	}

	@Override
	public void addResident(Resident resident) {
		if (residentList.size() < DEFAULT_CAPACITY) {
			residentList.add(resident);
		} else {
			System.out.println("В квартиру нельзя поселить больше 2-х жителей!");
		}
	}
}
