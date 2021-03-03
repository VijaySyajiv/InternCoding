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

public class CharIdentify {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the character");
        char c=in.next().charAt(0);
        
        if(c>='A'&&c<='Z')
            System.out.println("the entered character is uppercase");
        else  if(c>='a'&&c<='z')
            System.out.println("the entered character is lowercase");
        else  if(c>='0'&&c<='9')
            System.out.println("the entered character is number");
        else
            System.out.println("the entered character is Special character");
        in.close();
    }
}
