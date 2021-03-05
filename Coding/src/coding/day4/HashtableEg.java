package coding.day4;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import coding.InputValidation;

public class HashtableEg {

	public static void main(String[] args) {
		Hashtable<Integer,Employee> zoho=new Hashtable<>();
		System.out.println("................Empoyee Database List..........");
		while(true) {
			Scanner in =new Scanner(System.in);
			System.out.println("choose the option..........");
			System.out.println("1- Add\n2- remove \n3- exit");
			int option=InputValidation.integerValidation();
			
			if(option==1) {
				System.out.println("employee ID");
				int id=InputValidation.integerValidation();
				Employee object =Employee.Details();
				zoho.putIfAbsent(id,object);
				System.out.println("Hashtable Size "+zoho.size());
			}
			if(option==2) {
				System.out.println("enter the id");
				int id=InputValidation.integerValidation();
//				map interface->Entry interFace has lot of method
//				->entrySet return collection-view of the map k,v in hashtablclass
				for(Map.Entry<Integer,Employee> emp:zoho.entrySet()){  
					   if(emp.getKey()==id) {
						   zoho.remove(emp.getKey());
					   }
			     } 
				
			} 
			if(option==3) {
				System.out.println("Total Employees "+Employee.total);
//				for(Map.Entry<Integer,Employee> emp:zoho.entrySet()){  
//					   System.out.println("Employee ID - "+emp.getKey()+"  "+emp.getValue());
//					  
//			     } 
				 Enumeration<Integer> keys = zoho.keys();
			        while(keys.hasMoreElements()){
			            int key = keys.nextElement();
			            System.out.println("Employee ID  "+key+" :- "+zoho.get(key));
			        }
				//in.close();
				System.exit(0);
			}
				
		}

	}

}
