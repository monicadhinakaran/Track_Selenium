package com.orangehrm.seleniumuiframework.generic_utility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Java_Utility {

	//Generate the random number
	public int getRandomNumber(int range) {
		Random random = new Random();
		int randomnumbereInRange = random.nextInt(range);
		return randomnumbereInRange;
	}
	
	//Generate currrent date
	public String getCurrentDate(String dateFormat) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}
	
	//Counting days
	public String getRequiredDate(int days) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		sdf.format(date);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String required_Date = sdf.format(cal.getTime());
		return required_Date;
	}
	
	//Genrete random value(Alphanumeric)
	public String getRandomValue() {
		UUID randomData = UUID.randomUUID();
		String value = randomData.toString().replace("[^a-zA-Z]", "");
		return value;
	}
	
}
