package edu.jbegin.oop.city;

import java.util.List;

public interface City {

	String getName();

	List<House> getHouse();

	void addHouse(House house);

	void showResidentList();

}
