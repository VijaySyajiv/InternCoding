package dayFive;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXml {
	public static void main(String[] args) throws Exception {
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
		                    System.out.println("Employee Name: " + EmployeeElement.getElementsByTagName("Name").item(0).getTextContent());
	                
		
		                    NodeList EmployeeDetails =  Employee.getChildNodes(); 
		                    
			                    for(int j = 0; j < EmployeeDetails.getLength(); j++){
				                        Node detail = EmployeeDetails.item(j);
				                        if(detail.getNodeType() == Node.ELEMENT_NODE) {
				                            Element detailElement = (Element) detail;
				                            String tagName=detailElement.getTagName();
				                            System.out.println(tagName+"  "+EmployeeElement.getElementsByTagName(tagName).item(0).getTextContent());
				                            
				                        }
				                        else
				                        	System.out.println("fdjk");
			
			                    }System.out.println();
	
	                }
            }
		}
		catch (Exception e) {
			System.out.println(e +" hhj");
		}
		
	}

}
