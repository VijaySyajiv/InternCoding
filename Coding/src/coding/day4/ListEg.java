package coding.day4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import coding.InputValidation;

public class ListEg {
	public static void main(String[] args) {
		List<Employee> zoho=new LinkedList<>();
		System.out.println("................Empoyee Database List..........");
		while(true) { 
			Scanner in =new Scanner(System.in);
			System.out.println("choose the option..........");
			System.out.println("1- Add\n2- remove \n3 -Add->Index\n4- exit");
			int option=InputValidation.integerValidation();
			
			if(option==1) {
				Employee object =Employee.Details();
				zoho.add(object);
			}
			if (option==2) {
				System.out.println("enter the name");
				String name=in.next();
				
				for(Employee e:zoho) {
					if(name.equals(e.getName())) {
						zoho.remove(e);
					}
				}

			}
			if(option==3) {
				System.out.println("Enter the index");
				int index=in.nextInt();
				Employee object =Employee.Details();
				zoho.add(index,object);
			
			}
			if(option==4) {
				System.out.println("Total Employees "+Employee.total);
				int i=1;
				for(Employee e:zoho) {
					System.out.println("Employee "+(i++)+" "+e);
				}
				
				System.exit(0);
			}
		}
		//ARR to list
		//String[] array = zoho.toArray(new String[zoho.size()]); 
		
	}

}
