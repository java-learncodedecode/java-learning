package com.example.designpatterns.creational.prototype;

public class Doctor extends Profession {
	private String name;
	private int age;
	private int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Doctor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public Profession copy() {
		Doctor teacherClone = new Doctor(this.getName(), this.getAge());
		teacherClone.setSalary(this.getSalary());
		return teacherClone;
	}
}
