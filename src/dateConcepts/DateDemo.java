package dateConcepts;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss"); //HH - 24 format
		System.out.println(sd.format(d));
	}

}
