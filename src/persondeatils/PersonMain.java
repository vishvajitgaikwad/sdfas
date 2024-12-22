package persondeatils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String addharNumber;
		String name;
		Date DOB;
		String area;
		String city;
		String houseNo;
		String state;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		name = sc.nextLine();
		System.out.println("enter addharNumber");
		addharNumber = sc.nextLine();
		System.out.println("enter DOB");
		String Tdob = sc.nextLine();
		DOB = dateDecod(Tdob);
		System.out.println("enter houseNo");
		houseNo = sc.nextLine();
		System.out.println("enter area");
		area = sc.nextLine();
		System.out.println("enter city");
		city = sc.nextLine();
		System.out.println("enter state");
		state = sc.nextLine();
	
		Address addr = new Address(area, city, houseNo, state);
		Person person = new Person(addharNumber, name, DOB, addr);
		
		Date beforeCheck = dateDecod("15/08/1947.");
		
		if(beforeCheck.after(person.getDOB())) {
			System.out.println("person born after 15 th August 1947.");
		}else {
			System.out.println("person born before 15 th August 1947.");
		}
		
		System.out.println(person);
		
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
}
