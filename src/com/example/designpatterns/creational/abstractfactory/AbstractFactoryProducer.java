package com.example.designpatterns.creational.abstractfactory;

public class AbstractFactoryProducer {

	public static AbstractFactory getProfession(boolean status) {
		if (status) {
			return new ProfessionFactory();
		} else {
			return new ContractFactory();
		}
	}

}
