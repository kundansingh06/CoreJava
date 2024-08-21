package basic.Introduction.Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Solution {
	public static String getDay(String day, String month, String year) {

		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
		Calendar calc = Calendar.getInstance();
		calc.set(Integer.valueOf(year), Integer.valueOf(month) - 1,
				Integer.valueOf(day));
		return simpleDateformat.format(calc.getTime()).toUpperCase();
	}
}