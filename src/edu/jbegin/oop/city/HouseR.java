package edu.jbegin.oop.city;

import java.util.ArrayList;
import java.util.List;

public class HouseR implements House {

	private String address;
	private List<Flat> flatList = new ArrayList<>();

	public HouseR() {
	}

	public HouseR(String address) {
		super();
		this.address = address;
	}

	@Override
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}

	@Override
	public void addFlat(Flat flat) {
		flatList.add(flat);
	}
}
