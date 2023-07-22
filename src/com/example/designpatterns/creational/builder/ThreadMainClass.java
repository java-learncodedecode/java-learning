package com.example.designpatterns.creational.builder;

public class ThreadMainClass {

	public static void main(String[] args) {
		TeacherReceiver sr = new TeacherReceiver();
		System.out.println(sr.getTeacher());
	}

}

class TeacherReceiver {
	private volatile Teacher teacher;

	public TeacherReceiver() {
		Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
            	teacher = Teacher.Builder.getInstance()
                        .setId(1)
                        .setName("Ram")
                        .setAddress("Noida")
                        .build();
        		//System.out.println(teacher);
            	
            }});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
            	teacher = Teacher.Builder.getInstance()
                        .setId(1)
                        .setName("Ram1")
                        .setAddress("Noida1")
                        .build();
        		//System.out.println(teacher);
            	
            }});
		t2.start();
		
	}

	public Teacher getTeacher() {
		return teacher;
	}
}
