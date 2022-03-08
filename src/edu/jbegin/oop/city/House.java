package edu.jbegin.oop.city;

import java.util.List;

public interface House {
	
	String getAddress();
	
	void addFlat(Flat flat);
	
	List<Flat> getFlatList();

}
