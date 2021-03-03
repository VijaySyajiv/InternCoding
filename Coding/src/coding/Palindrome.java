/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.next();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i))
                continue;
            else{
                System.out.println("Given String is not a Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Given String is a Palindrome");
        in.close();
    }
}
