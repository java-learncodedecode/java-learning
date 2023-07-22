package com.example.designpatterns.structural.facade;

public class NonVegMenu implements Menus {

	@Override
	public Menus getMenus() {
		NonVegMenu nonveg = new NonVegMenu();
		System.out.println("veg menu");
		return nonveg;
	}
}
