/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         System.out.println("Enter the string");
         String s=in.next();int i=0;
        try{
         for(int j=0;0<=j;j++){
            s.charAt(j);         
             i++;
         }
        }
        catch(Exception e){
            System.out.println(i);
        }
        //or by this method
//         for(char c:s.toCharArray())
//             i++;
//         System.out.println(i);
    }
}
