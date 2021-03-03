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
class Veg{
    int priceOfDish;
    String nameOfDish;
    
    Veg(int priceOfDish,String nameofDish){
        this.nameOfDish=nameofDish;
        this.priceOfDish=priceOfDish;
    }
    public String toString(){
        return  nameOfDish+"       "+priceOfDish;
    }
}
public class Menu {
    public static void main(String[] args) {
        Veg dish1=new Veg(40,"DOSA        ");
        Veg dish2=new Veg(100,"MASALA DOSA");
        
        System.out.println("DISH NAME         PRICE");
        System.out.println(dish1.toString());
        System.out.println(dish2.toString());
        
    }
}
