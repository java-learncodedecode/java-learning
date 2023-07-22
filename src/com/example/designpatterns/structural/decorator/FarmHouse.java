package com.example.designpatterns.structural.decorator;

public class FarmHouse extends Pizza {
	public FarmHouse() {
		description = "FarmHouse";
	}

	public int getCost() {
		return 200;
	}
}
