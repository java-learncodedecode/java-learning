package com.java.dev;

class ThisSuperDemo {
	public static void main(String args[]) {
		Student obj = new Student();
		obj.a = 1;
		obj.b = 1;
		System.out.println("in main start- " + obj.a + obj.b);
	}
}