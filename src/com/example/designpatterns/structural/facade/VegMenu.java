package com.example.designpatterns.structural.facade;

public class VegMenu implements Menus {

	@Override
	public Menus getMenus() {
		VegMenu veg = new VegMenu();
		System.out.println("veg menu");
		return veg;
	}
}
