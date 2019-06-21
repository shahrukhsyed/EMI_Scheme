package com.cg.eis.service;

public interface Validator {
//	String aidpattern="[1-9][0-9][0-9]"; // //d indicate start with digits
//	String mobilepattern="[1-9]{1}[0-9]{9}";
//	String namepattern="([A-Z]{1}[a-z]{2}([a-z])*) ([A-Z]{1}[a-z]{2}([a-z])*)";
//	String   balancepattern="(([1-9]([0-9]))*.([0-9]*))";
//	
	
	String empIdpattern="[1-9][0-9][0-9]";
	String empNamepattern = "[A-Za-z]{3}([A-Za-z])*( [A-Za-z]{3}([A-Za-z])*)* [A-Za-z]{3}([A-Za-z])*";
	String empDesgpattern="clerk|system associate|programmer|manager";
	
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}