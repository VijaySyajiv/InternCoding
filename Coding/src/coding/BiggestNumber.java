/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        int n,big;
         
          while(true){
              System.out.println("Enter the size of the Array");
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
        big=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp;
             while(true){
              System.out.println("Enter the integer "+(i+1));
                   String s=in.next();
                  try{
                      temp=Integer.parseInt(s);
                      break;
                  }    
                  catch(Exception e){
                      System.out.println(" invalid input ");
                      continue;
                  }
                      
               }
            if(big<temp)
                big=temp;
        }
         in.close();
        System.out.println("the biggest number in the array is "+big);
    }
}
