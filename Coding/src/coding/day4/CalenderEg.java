package coding.day4;
import java.util.*;

import coding.InputValidation;
public class CalenderEg {

	public static void main(String[] args) {
//		this class Singleton pattern because we can do the things 
//		what ever we want using one object in these class
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));  
		   System.out.println("The current date is : " + calendar.getTime()); 
           calendar.add(Calendar.DATE, -15);
		   System.out.println("15 Days ago the data is - "+calendar.getTime().getDate());
		   System.out.println("15 Days ago the day is - "+calendar.getTime().getDay());
		   System.out.println("15 Days ago the data is - "+calendar.getTime());
		  
		   
	
		
		
		   
		   
	}

}
