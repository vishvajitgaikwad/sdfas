package com.shivansh.studentclass;

import java.util.Date;

public class Student {
	
	private int rollNo;
	private String name;
	private int marks;
	private Course course;
	private Date DOB;
	
	public static int count = 1;
	
	public Student() {
		this.rollNo = count++;
	}
	
	public Student(String name, int marks, Course course, Date DOB) {
		super();
		this.rollNo = count++;
		this.name = name;
		this.marks = marks;
		this.course = course;
		this.DOB = DOB;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", course=" + course + ", DOB="
				+ DOB + "]";
	}

	public Date getDOB() {
		return DOB;
	}

}
