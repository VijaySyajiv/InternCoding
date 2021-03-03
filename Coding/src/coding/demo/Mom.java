/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.demo;

/**
 *
 * @author Lenovo
 */
public class Mom extends Mobile {
    
    public static void main(String[] args) {
        Mom nokia=new Mom();
        System.out.println("Mobile Colour "+nokia.mobileColour);
         System.out.println("Mobile Price "+nokia.price);
        nokia.calling();
        nokia.camera();
        nokia.whatsApp();
       
    }
}
