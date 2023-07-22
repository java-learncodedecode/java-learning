package com.example.designpatterns.creational.factory;

public class ProfessionFactory {

	public Profession getProfession(ProfessionEnum professionEnum) {
		switch (professionEnum) {
		case TEACHER:
			return new Teacher();
		case DOCTOR:
			return new Doctor();
		case ENGINEER:
			return new Engineer();
		default:
			break;
		}
		return null;
	}
}
