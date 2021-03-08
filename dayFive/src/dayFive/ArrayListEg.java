package dayFive;

import java.util.*;

public class ArrayListEg {
		public static void main(String[] args) {
			List<Employee> zoho=new ArrayList<>();
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
//					for(Employee e:zoho) {
//						System.out.println("Employee "+(i++)+" "+e);
//					}
//					Iterator interface -> 	 methods over rided  by Arraylist	
					//Iterator itr = zoho.iterator(); 
					ListIterator<Employee> itr = zoho.listIterator(); 
					
			        while (itr.hasNext()) 
			        { 
			        	System.out.print("Employee -"+itr.nextIndex()+" "+itr.next()); 
			        }
			       System.out.println("BackWard");
			        while (itr.hasPrevious()) 
			        { 
			            System.out.print("Employee -"+itr.previousIndex()+" "+itr.previous()); 
			        } 
					
					System.exit(0);
				}
					
			}
			
			
		}
		
}

