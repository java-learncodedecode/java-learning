package com.example.designpatterns.creational.abstractfactory;

public class ProfessionFactory extends AbstractFactory{

	@Override
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
