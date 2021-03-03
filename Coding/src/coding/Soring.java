/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.util.Scanner;

public class Soring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
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
        int[] Array=new int[n];
       
        for(int i=0;i<n;i++){
             while(true){
               System.out.println("Enter the Integers "+(i+1));
                   String s=in.next();
                  try{
                       Array[i]=Integer.parseInt(s);
                      break;
                  }    
                  catch(Exception e){
                      System.out.println(" invalid input ");
                      continue;
                  }
                      
               }
        }
               
        sorting(Array,0,Array.length-1);
        System.out.println("Ascending order");
        for(int i:Array)
            System.out.print(i+" ");
        in.close();
    }
    public static void sorting(int[] a,int lb,int ub){
         if (lb < ub) {
            int m =(lb+ub)/2;
            sorting(a, lb, m);
            sorting(a, m + 1, ub);
            merge(a, lb, m, ub);
        }
    }
    public static void merge(int a[], int lb, int m, int ub)
    {
        int i=lb,k=lb,j=m+1;
        int[] b=new int[ub+1];
       while(i<=m&&j<=ub){
            if(a[i]<a[j])
                b[k++]=a[i++];
            else if(a[i]>a[j])
                b[k++]=a[j++];
                
        }
        while (i <=m) 
            b[k++] = a[i++];
           
        while (j <= ub) 
            b[k++] = a[j++];
       for(i=lb;i<=ub;i++)
                a[i]=b[i];
    }
}


