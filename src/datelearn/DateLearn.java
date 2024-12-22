package datelearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);
		
		final String FORMAT = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT); 
		System.out.println(sdf.format(date));
		
		System.out.println(date.after(date));
		System.out.println(date.before(date));
		System.out.println(date);
		
		long milis =  date.parse("26/09/2024");
		System.out.println(milis);
		
		try {
			
			Date prev = sdf.parse("28-09-2024");
			Date after = sdf.parse("28-09-2024");
			System.out.println(date.after(prev));
			System.out.println(date.before(after));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
