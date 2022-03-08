package edu.jbegin.oop.city;

import java.util.ArrayList;
import java.util.List;

public class MyCity implements City {

	private String name;
	private List<House> houseList = new ArrayList<>();

	public MyCity() {
	}

	public MyCity(String name, List<House> houseList) {
		this.name = name;
		this.houseList = houseList;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<House> getHouse() {
		return houseList;
	}

	@Override
	public void addHouse(House house) {
		houseList.add(house);
	}

	@Override
	public void showResidentList() {
		System.out.println("Город: " + name);
		for (House house : houseList) {
			System.out.println("Дом: " + house.getAddress());

			for (Flat flat : house.getFlatList()) {

				System.out.println("--Квартира: " + flat.getNumberFlat());
				if (flat.getResidentList().isEmpty()) {
					System.out.println("---В кватире никто не живёт...");
					continue;
				}

				for (Resident resident : flat.getResidentList()) {
					System.out.println("---Житель: " + resident.getName());

				}
			}
			System.out.println();
		}
	}
}
