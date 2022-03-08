package edu.jbegin.oop.city;

import java.util.List;

public interface Flat {
	
	int DEFAULT_CAPACITY = 2;
	
	int getNumberFlat();
	
	void addResident(Resident resident);
	
	List <Resident> getResidentList();

}
