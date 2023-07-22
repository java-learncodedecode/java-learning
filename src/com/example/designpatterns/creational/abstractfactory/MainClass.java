package com.example.designpatterns.creational.abstractfactory;

public class MainClass {

	public static void main(String[] args) {
	
		AbstractFactory factory = AbstractFactoryProducer.getProfession(false);
		Profession profession = factory.getProfession(ProfessionEnum.ENGINEER);
		profession.myjob();

	}

}
