package com.example.designpatterns.creational.prototype;

public class MainClass {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Praveen", 30);
		teacher.setSalary(5000);
		
		System.out.println(teacher);
        Teacher anotherTeacher = (Teacher) teacher.copy();
        anotherTeacher.setSalary(15000);
        anotherTeacher.setName("Alok");
        System.out.println(anotherTeacher);

	}

}
