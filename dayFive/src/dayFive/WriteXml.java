package dayFive;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
 
public class WriteXml {
	public static void main(String[] args) throws Exception{
		  
	      ArrayList<Employee> zoho=new ArrayList<>();
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
//					Iterator interface -> 	 methods over rided  by Arraylist	
//					Iterator itr = zoho.iterator(); 
//					ListIterator itr = zoho.listIterator(); 
//					
//			        while (itr.hasNext()) 
//			        { 
//			        	System.out.print("Employee -"+itr.nextIndex()+" "+itr.next()); 
//			        }
//			       System.out.println("BackWard");
//			        while (itr.hasPrevious()) 
//			        { 
//			            System.out.print("Employee -"+itr.previousIndex()+" "+itr.previous()); 
//			        } 
					
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				    DocumentBuilder builder = factory.newDocumentBuilder();//for DocumentBuilder.object
				    Document doc=builder.newDocument();//dom object
				    Element employeeRoot=doc.createElement("Employees");
				    
				    for(Employee e:zoho) {
						
				    
					Element employee=doc.createElement("Employee");
					Element name=doc.createElement("Name");
					Element phoneNumber=doc.createElement("Phonenumber");
					Element age=doc.createElement("Age");
					Element dept=doc.createElement("Department");
					Element salary=doc.createElement("Salary");
						Text t1=doc.createTextNode(e.getName());
					    Text t2=doc.createTextNode(String.valueOf(e.getPhonNumber()));
					    Text t3=doc.createTextNode(String.valueOf(e.getAge()));
					    Text t4=doc.createTextNode(e.getDpt());
					    Text t5=doc.createTextNode(String.valueOf(e.getSalary()));
					    
					    name.appendChild(t1);
					    phoneNumber.appendChild(t2);
					    age.appendChild(t3);
					    dept.appendChild(t4);
					    salary.appendChild(t5);
					     
					    employee.appendChild(name);
					    employee.appendChild(phoneNumber);
					    employee.appendChild(age);
					    employee.appendChild(dept);
					    employee.appendChild(salary);
					    
					    
					    employeeRoot.appendChild(employee);
					     
					    
								
								
					}
				   doc.appendChild(employeeRoot);
				    Transformer t=TransformerFactory.newInstance().newTransformer();
				                   //source file,output destination file
				   t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("E:\\Xml\\EmployeeBankDetails.xml")));
				    System.out.println("Xml Created");
					System.exit(0);
					
				}
					
				
			}
		

	}


}
