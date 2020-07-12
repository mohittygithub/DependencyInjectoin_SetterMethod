package com.spring.di.setter;

public class Student {

	private String studentName;
	private int age;
	private String subjectStream;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubjectStream(String subjectStream) {
		this.subjectStream = subjectStream;
	}
	
	public void displayStudent() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Student age is : " + age);
		System.out.println("Student subject stream  is : " + subjectStream);
	}
	
	
}
