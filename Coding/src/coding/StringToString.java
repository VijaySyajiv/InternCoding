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
public class StringToString {
     public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         System.out.println("Enter the string");
         String s1=in.next(),s2="";
         for(char i:s1.toCharArray())
             s2+=i;
         System.out.println("String copied "+s2);
    }
}
