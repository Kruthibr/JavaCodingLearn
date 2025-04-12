package dateConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c =Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss"); //HH - 24 format
		System.out.println(sd.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}

}
