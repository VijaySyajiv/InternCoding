package coding.day4;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesEg {
	public static void main(String[] args)throws Exception{  
		  
		Properties p1=new Properties();  
		p1.setProperty("name","Vijay");  
		p1.setProperty("email","svijay2000@gmail.com");  
		  
		p1.store(new FileWriter("info.properties"),"Log-in Details");  
		 p1.clear();
		 
		FileReader reader=new FileReader("Info.properties");  
//	    Properties p2=new Properties();  
	    p1.load(reader);  
	      
	    System.out.println(p1.getProperty("name"));  
	    System.out.println(p1.getProperty("email"));
	    p1.clear();
	    p1=System.getProperties();  
	    Set set=p1.entrySet();  
	    
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
		    Map.Entry entry=(Map.Entry)itr.next();  
		    System.out.println(entry.getKey()+" = "+entry.getValue());  
	    }  
		  
		}  

}
