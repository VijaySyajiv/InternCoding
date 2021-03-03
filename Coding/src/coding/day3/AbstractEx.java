/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.day3;

/**
 *
 * @author Lenovo
 */
abstract class Hotel{
    Hotel(){
        System.out.println("........Welcome To Zoho Canteen.............");
        qoute();
    }
    private void qoute(){
        System.out.println("........We Will Statisfy you..............");
        System.out.println("........With Our Quality & Quantity.......");
    }
    static void drink(){
        System.out.println("Tea  coffee   Milk ");
    }
    final void greeting(){
         System.out.println("Thank You Using The Zoho Canteen ");
            System.out.println("WAITING  FOR YOUR VISIT AGAIN");
    }
    abstract void veg();
    abstract void nonVeg();
}
abstract class SundaramMaster extends Hotel{
    @Override
    void veg(){
        System.out.println("Veg meals -- Tomato Rice -- Lemon Rice--  Curd Rice");
    }
   
    
    
}
abstract class ArsathKhan extends SundaramMaster{
    @Override
    void nonVeg(){
        System.out.println("NonVeg meals -- Egg Rice -- Chcken Rice -- Kalaki");
    }
    
}
class Manikandan extends Hotel{
    @Override
        void veg(){
        System.out.println("Veg meals -- Tomato Rice -- Lemon Rice -- Curd Rice");
    }
    
    @Override
    void nonVeg(){
        System.out.println("NonVeg meals -- Egg Rice -- Chcken Rice -- Kalaki");
    }
    
}
public class AbstractEx {
    public static void main(String[] args) {
        Manikandan object =new Manikandan();
        
        Hotel.drink();
        object.nonVeg();
        object.veg();
        object.greeting();
    }
}
