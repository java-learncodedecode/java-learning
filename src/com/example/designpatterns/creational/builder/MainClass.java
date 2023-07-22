package com.example.designpatterns.creational.builder;

public class MainClass {

	public static void main(String[] args) {
	
		Teacher teacher = Teacher.Builder.getInstance()
                .setId(1)
                .setName("Ram")
                .setAddress("Noida")
                .build();
		System.out.println(teacher);
	}
}
