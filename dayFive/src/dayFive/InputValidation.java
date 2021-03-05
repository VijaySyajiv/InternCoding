package dayFive;

import java.util.Scanner;
public class InputValidation {
    public static int integerValidation(){
        int n;
        
        while(true){
        	Scanner in =new Scanner(System.in);
                   String s=in.next();
                  try{
                      n=Integer.parseInt(s);
                      return n;
                  }    
                  catch(NumberFormatException e){
                      System.out.println(" invalid input");
                      System.out.println("Please enter the number integer");
                      continue;
                  }
                      
               }
    }
}

