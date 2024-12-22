package com.shivansh.studentclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Student[] list = new Student[3];
		
		int option = -1;
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		do {
			System.out.println("enter 1 to add student");
			System.out.println("enter 2 to get Student detail");
			System.out.println("enter 3 to get all student details");
			System.out.println("enter 0 to exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
				case 1:{
					System.out.println("enter name");
					String name = sc.nextLine();
					System.out.println("enter marks");
					int marks = sc.nextInt();
					sc.nextLine();
					System.out.println("enter Course");
					String Tcourse = sc.nextLine();
					Course course = Course.getCouse(Tcourse);
					System.out.println("enter marks");
					String DOB = sc.nextLine();
					Date decodeDate = dateDecod(DOB);
					Student s = new Student(name, marks, course, decodeDate);
					list[count++] = s;
					System.out.println(s);
				}
				break;
				case 2:{
					System.out.println("enter roll");
					int roll = sc.nextInt();
					System.out.println(list[roll - 1]);
				}
				break;
				case 3:{
					sort(list, count);
					for (int i = 0; i < count; i++) {
						System.out.println(list[i]);
					}
				}
			}
			
			
		}while(option != 0);
		
		sc.close();
		
	}
	
	public static Date dateDecod(String date) {
		final String FORMAT = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT); 
		try {
			Date dateDecoded = sdf.parse(date);
			return dateDecoded;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void sort(Student[] stu, int size) {	
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if(stu[j].getDOB().before(stu[i].getDOB())) {
					Student temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	}
	
}
