package dayFive;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class ReadXml {
	public static void main(String[] args) throws Exception {
		List<Employee> zoho=new ArrayList<>();
		try {
			
			File file=new File("E:\\Xml\\EmployeeBankDetails.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    Document doc=builder.parse(file);
		    System.out.println("Root Element "+doc.getDocumentElement().getNodeName());
		    
		    
		    NodeList Employees = doc.getElementsByTagName("Employee");
		    
            for(int i = 0; i <Employees.getLength(); i++) {
                Node Employee = Employees.item(i);
                
	                if(Employee.getNodeType() == Node.ELEMENT_NODE) {
			                    Element EmployeeElement = (Element) Employee;
	//		                    System.out.println("Employee Name: " + EmployeeElement.getElementsByTagName("Name").item(0).getTextContent());
	//		                    System.out.println(Node.ELEMENT_NODE);
		                
			                    NodeList EmployeeDetails =  Employee.getChildNodes(); 
			                    String tempString="";
			                    
				                    for(int j = 0; j < EmployeeDetails.getLength(); j++)
				                    {
				                    	
						                        Node detail = EmployeeDetails.item(j);
						                        
						                        if(detail.getNodeType() == Node.ELEMENT_NODE) 
						                        {
							                            Element detailElement = (Element) detail;
							                            String tagName=detailElement.getTagName();
							                            String value=EmployeeElement.getElementsByTagName(tagName).item(0).getTextContent();
							                             System.out.println(tagName+"  "+value);
							                             tempString+=value+" ";
						                        }
						                        else
						                        	System.out.println("fdjk");
				
				                    }
				                    
				                    System.out.println();
				                    
				                    
				                    String[] tempStringArray=tempString.split(" ");
				                    Employee obj=new Employee(tempStringArray[0],Integer.parseInt(tempStringArray[1]),Integer.parseInt(tempStringArray[2]),tempStringArray[3],Integer.parseInt(tempStringArray[4]));
				                    zoho.add(obj);
		
	                }
            }
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("From object Values");
		int i=1;
		
		for(Employee e:zoho) {
			System.out.println("Employee "+i+" "+e);
			i++;
		}
	}

}
