package com.example.designpatterns.structural.facade;

public class MainClass {

	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();
		keeper.getVegMenu();
		keeper.getNonVegAndVegMenu();
		keeper.getNonVegMenu();
	}

}
