package persondeatils;

public class Address {
	
	private String area;
	private String city;
	private String houseNo;
	private String state;
	
	public Address(String lane, String city, String houseNo, String state) {
		super();
		this.area = lane;
		this.city = city;
		this.houseNo = houseNo;
		this.state = state;
	}

	public String getLane() {
		return area;
	}

	public void setLane(String lane) {
		this.area = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [lane=" + area + ", city=" + city + ", houseNo=" + houseNo + ", state=" + state + "]";
	}
	
	

}
