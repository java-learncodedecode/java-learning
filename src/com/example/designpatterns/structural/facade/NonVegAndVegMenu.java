package com.example.designpatterns.structural.facade;

public class NonVegAndVegMenu implements Menus {

	@Override
	public Menus getMenus() {
		NonVegAndVegMenu nonvegandveg = new NonVegAndVegMenu();
		System.out.println("non veg & veg menu");
		return nonvegandveg;
	}
}
