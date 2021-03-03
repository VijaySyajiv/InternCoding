/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Aggrgation
package coding.day3;
class Specification{
    int ram;
    int internalStorage;
    String colour;
    Specification(String colour,int ram,int internalStorage){
        this.colour=colour;
        this.internalStorage=internalStorage;
        this.ram=ram;
    }
    @Override
    public String toString(){
        return (ram+" | "+internalStorage+"      |   "+colour);
    }
}
class SmartPhone{
    String name;          
    Specification specification;
    SmartPhone(String name,Specification specification){
        this.name=name;
        this.specification=specification;
    }
    public String toString(){
        return name+"     |      "+specification;
    }
            
}
public class ZohoMobileShop {
    public static void main(String[] args) {
        try{
        System.out.println("'''''''''''''''''''''''''   Zoho mobile Shop............................");
        
        Specification spec=new Specification("black",4,64);
        SmartPhone obj=new SmartPhone("NOKIA 5",spec);
        System.out.println("Mobile Name |   Ram  | Storage |   Colour");
            System.out.println(obj);
        }
        
        finally{
            System.out.println("          Thank You  ");
            System.out.println("WAITING  FOR YOUR VISIT AGAIN");
        }
        
        
    }
    
}
