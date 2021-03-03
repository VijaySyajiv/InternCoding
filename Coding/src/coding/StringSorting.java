/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.*;
public class StringSorting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
      
        int n;
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
        System.out.println("Enter the name one by one");
        String[] s=new String[n]; 
        for(int i=0;i<n;i++)
            s[i]=in.next();
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++)
                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
                    
        }
        System.out.println("Sorted list");
        for(String i:s)
            System.out.println(i);
    }
}
