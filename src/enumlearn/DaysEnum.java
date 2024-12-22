package enumlearn;

public enum DaysEnum {

	MONDAY("todays monday"),
	TUESDAY("todays monday"),
	WEDNESSDAY("todays monday"),
	THURSDAY("todays monday"),
	FRIDAY("todays monday"),
	SATURDAY("todays monday"),
	SUNDAY("todays monday");
	
	private String str;
	
	private  DaysEnum(String str) {     // constructor for key value pair
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
	
}
