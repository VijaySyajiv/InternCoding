/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        
        while(true){
              System.out.println("Enter the number to find the factorial");
                   String s=in.next();
                  try{
                      n=Integer.parseInt(s);
                      break;
                  }    
                  catch(Exception e){
                      System.out.println(" invalid input ");
                      continue;
                  }
                      
               }
        System.out.println("factorial is "+factorial(n));
        in.close();
    }
 public static long factorial(long n){
     if(n==1)
         return 1;
     return n*factorial(n-1);
 }
}
