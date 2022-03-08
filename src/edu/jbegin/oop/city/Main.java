package edu.jbegin.oop.city;

public class Main {

	public static void main(String[] args) {

		MyCity city = new MyCity();
		city.setName("Солнечный город");

		HouseR house1 = new HouseR("ул. Тенистая, д. 12");
		HouseR house2 = new HouseR("ул. Виноградная, д. 5");
		HouseR house3 = new HouseR("ул. Туманная, д. 11");
		HouseR house4 = new HouseR("ул. Ленина, д. 1");
		HouseR house5 = new HouseR("ул. Абрикосовая, д. 23");
		HouseR house6 = new HouseR("ул. Кривоколенная, д. 1");
		HouseR house7 = new HouseR("ул. Крутая горка, д. 7");

		FlatR flat1 = new FlatR(1);
		FlatR flat2 = new FlatR(2);
		FlatR flat3 = new FlatR(18);
		FlatR flat4 = new FlatR(11);
		FlatR flat5 = new FlatR(5);
		FlatR flat6 = new FlatR(9);
		FlatR flat7 = new FlatR(7);
		FlatR flat8 = new FlatR(15);
		FlatR flat9 = new FlatR(18);
		FlatR flat10 = new FlatR(3);

		house1.addFlat(flat1);
		house1.addFlat(flat2);

		house2.addFlat(flat3);
		house2.addFlat(flat4);

		house3.addFlat(flat5);
		house3.addFlat(flat6);

		house4.addFlat(flat7);
		house4.addFlat(flat8);

		house5.addFlat(flat9);
		house5.addFlat(flat10);

		house6.addFlat(flat2);
		house6.addFlat(flat3);

		house7.addFlat(flat4);
		house7.addFlat(flat5);

		city.addHouse(house1);
		city.addHouse(house2);
		city.addHouse(house3);
		city.addHouse(house4);
		city.addHouse(house5);
		city.addHouse(house6);
		city.addHouse(house7);

		Resident resident1 = new Resident("resident1");
		Resident resident2 = new Resident("resident2");
		Resident resident3 = new Resident("resident3");
		Resident resident4 = new Resident("resident4");
		Resident resident5 = new Resident("resident5");
		Resident resident6 = new Resident("resident6");
		Resident resident7 = new Resident("resident7");
		Resident resident8 = new Resident("resident8");
		Resident resident9 = new Resident("resident9");
		Resident resident10 = new Resident("resident10");

		flat1.addResident(resident1);
		flat1.addResident(resident2);
		flat2.addResident(resident3);
		flat2.addResident(resident4);

		flat3.addResident(resident3);
		flat3.addResident(resident10);
		flat4.addResident(resident4);

		flat5.addResident(resident5);
		flat6.addResident(resident6);
		flat7.addResident(resident7);
		flat8.addResident(resident8);
		flat8.addResident(resident1);
		flat8.addResident(resident3);

//		flat9.addResident(resident9);
		flat10.addResident(resident10);

		city.showResidentList();

	}
}
