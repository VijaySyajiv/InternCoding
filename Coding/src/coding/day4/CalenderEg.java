package coding.day4;
import java.util.*;

import coding.InputValidation;
public class CalenderEg {

	public static void main(String[] args) {
//		Calendar calendar = Calendar.getInstance();  
//		   System.out.println("The current date is : " + calendar.getTime()); 
//		   System.out.println("enter the DOB DD/MM/YYYY Formet");
//		   
//		   String sDate1="31/12/1998";
//		   Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
	
		
		//calendar.clear();
		Calendar calendar = Calendar.getInstance();  
		   System.out.println("At present Calendar's Year: " +calendar.get( Calendar.YEAR+3));  
		   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE)); 
		   
		   
	}

}
