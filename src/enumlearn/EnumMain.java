package enumlearn;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaysEnum day = DaysEnum.MONDAY;
		System.out.println(day);
		System.out.println(day.getValue());
		
		String tuesday =  DaysEnum.TUESDAY.toString();
		String tuesday2 =  DaysEnum.TUESDAY.toString();
		String wednesday =  DaysEnum.WEDNESSDAY.toString();
		
		System.out.println(DaysEnum.TUESDAY == DaysEnum.TUESDAY);
		System.out.println(DaysEnum.TUESDAY.equals(DaysEnum.WEDNESSDAY));
		System.out.println((tuesday == tuesday2));           // true
		System.out.println((tuesday.equals(tuesday2)));      // true
		System.out.println((tuesday == wednesday));          // false 
		System.out.println((tuesday.equals(wednesday)));     // false
		
		for(DaysEnum tday : DaysEnum.values()) {
			System.out.println(tday);
		}
		
	}

}
