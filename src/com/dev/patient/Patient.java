package com.dev.patient;

public class Patient {

	private String name;
	private int age;
	private String desease;
	private Double billAmount;

	public Patient() {
		super();
	}

	public Patient(String name, int age, String desease, Double billAmount) {
		super();
		this.name = name;
		this.age = age;
		this.desease = desease;
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesease() {
		return desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", desease=" + desease + ", billAmount=" + billAmount + "]";
	}

}
