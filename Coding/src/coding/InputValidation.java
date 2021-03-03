/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class InputValidation {
    public static int integerValidation(){
        int n;
        Scanner in =new Scanner(System.in);
        while(true){
              System.out.println("Enter the number integer");
                   String s=in.next();
                  try{
                      n=Integer.parseInt(s);
                      return n;
                  }    
                  catch(NumberFormatException e){
                      System.out.println(" invalid input "+e);
                      continue;
                  }
                      
               }
    }
}
