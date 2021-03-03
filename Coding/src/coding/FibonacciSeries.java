/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n;
        while(true){
             System.out.println("Enter the number to find the Fibonacci Series");
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
        for(int i=0;i<n;i++)
            System.out.print(fibona(i)+" ");
        in.close();
    }
    public static long fibona(long n){
        if(n==1||n==0)
            return n;
        else
            return fibona(n-1)+fibona(n-2);
    }
    
}
