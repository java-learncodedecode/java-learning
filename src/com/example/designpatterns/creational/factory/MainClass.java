package com.example.designpatterns.creational.factory;

public class MainClass {

	public static void main(String[] args) {
		ProfessionFactory factory = new ProfessionFactory();
		Profession profession = factory.getProfession(ProfessionEnum.TEACHER);
		profession.myjob();

	}

}
