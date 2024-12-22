package com.shivansh.studentclass;

public enum Course {
	DAC,
	DESD,
	DVLSI;

	public static Course getCouse(String course) {
	
		if(course.equals("DAC")) {
			return Course.DAC;
		}else if(course.equals("DESD")) {
			return Course.DESD;
		}else if(course.equals("DVLSI")) {
			return Course.DVLSI;
		}
		
		return null;
	}
}
