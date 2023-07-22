package com.example.designpatterns.creational.abstractfactory;

public class ContractFactory extends AbstractFactory{

	@Override
	public Profession getProfession(ProfessionEnum professionEnum) {
		switch (professionEnum) {
		case TEACHER:
			return new ContractTeacher();
		case DOCTOR:
			return new ContractDoctor();
		case ENGINEER:
			return new ContractEngineer();
		default:
			break;
		}
		return null;
	}

}
