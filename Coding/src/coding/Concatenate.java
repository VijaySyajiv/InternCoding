/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.*;
public class Concatenate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String firstName,lastName;
        System.out.print("Enter the first name ");
        firstName=in.next();
       
        System.out.print("Enter the last name ");;
        lastName=in.next();
       
        String fullName=firstName+" "+lastName;
        System.out.println("Name - "+fullName);
        in.close();
    }
}
