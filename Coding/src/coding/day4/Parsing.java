package coding.day4;

import org.w3c.dom.*;
import org.xml.sax.*;

import javax.xml.parsers.*;
import java.io.*;
import java.io.*;

public class Parsing {

    /*
    * Get the Document Builder
    * Get Document
    * Normalize the xml structure
    * Get all the element by the tag name
    * */

    public static void main(String[] args) {

        //Get the Document Builder

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Get Document
            File file=new File("EmployeeBankDetails.xml");
            Document document = builder.parse(new File("file"));
 
            // Normalize the xml structure
            document.getDocumentElement().normalize();
 
            // Get all the element by the tag name

            NodeList laptopList = document.getElementsByTagName("Employee");
            for(int i = 0; i <laptopList.getLength(); i++) {
                Node laptop = laptopList.item(i);
                if(laptop.getNodeType() == Node.ELEMENT_NODE) {

                    Element laptopElement = (Element) laptop;
                    System.out.println("Employee Name: " + laptopElement.getAttribute("name"));

                    NodeList laptopDetails =  laptop.getChildNodes();
                    for(int j = 0; j < laptopDetails.getLength(); j++){
                        Node detail = laptopDetails.item(j);
                        if(detail.getNodeType() == Node.ELEMENT_NODE) {
                            Element detailElement = (Element) detail;
                            System.out.println("     " + detailElement.getTagName() + ": " + detailElement.getAttribute("value"));
                        }

                    }

                }
            }


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}