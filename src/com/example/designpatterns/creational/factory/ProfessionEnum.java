package com.example.designpatterns.creational.factory;

public enum ProfessionEnum {

	TEACHER("teacher"), ENGINEER("engineer"), DOCTOR("doctor");

	private String profession;

	private ProfessionEnum(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return this.profession;
	}

}
