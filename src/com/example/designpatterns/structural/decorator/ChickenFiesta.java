package com.example.designpatterns.structural.decorator;

public class ChickenFiesta extends Pizza {
	public ChickenFiesta() {
		description = "ChickenFiesta";
	}

	public int getCost() {
		return 200;
	}
}