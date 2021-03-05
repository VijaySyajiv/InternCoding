package coding.day4;
import java.text.SimpleDateFormat;
import java.util.*;
public class DOBInputFormatValidator  {
	public Date DOB() throws Exception{
		try {
		Scanner input=new Scanner(System.in);
		String dob=input.next();
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		System.out.println(date+" "+dob);
		return date;
		}
		catch(Exception E) {
			System.out.println(E);
		}
		
	}
	
}
