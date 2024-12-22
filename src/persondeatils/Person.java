package persondeatils;

import java.util.Date;

public class Person {
	
	private String addharNumber;
	private String name;
	private Date DOB;
	private Address address;
	
	public Person(String addharNumber, String name, Date dOB, Address address) {
		super();
		this.addharNumber = addharNumber;
		this.name = name;
		DOB = dOB;
		this.address = address;
	}

	public String getAddharNumber() {
		return addharNumber;
	}

	public void setAddharNumber(String addharNumber) {
		this.addharNumber = addharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [addharNumber=" + addharNumber + ", name=" + name + ", DOB=" + DOB + ", address=" + address
				+ "]";
	}
	
	
		
}
