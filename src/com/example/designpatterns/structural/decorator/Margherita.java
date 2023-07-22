package com.example.designpatterns.structural.decorator;

public class Margherita extends Pizza {
	public Margherita() {
		description = "Margherita";
	}

	public int getCost() {
		return 100;
	}
}
