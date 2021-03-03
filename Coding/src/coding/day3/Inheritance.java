/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.day3;

class Mobile {
    Mobile(){
        System.out.println("Please Use me with some Limitation");
    }
    public void Caliing(){
        System.out.println("Calling.....");
    }
    public void Messaging(){
        System.out.println("Messaging.......");
    }
    public void Camera(){
        System.out.println("Captured.......");
    }
}
//single Level
class Nokia3310 extends Mobile{
     Nokia3310(){
         System.out.println("Break Me If You Can");
     }
     public void snake(){
         System.out.println("Unforgettable game");
     }
           
}
//Multiple Level 
class Nokia5 extends Nokia3310{
     Nokia5(){
         System.out.println("Not Impressive");
     }
     public void videoCalling(){
         System.out.println("videoCalling........");
     }
     public void playStore(){
         System.out.println("Installing........");
     }
     @Override
     public void snake(){
         super.snake();
         System.out.println("looking good ");
     }
}
//Hierarchical 
class Mi extends Mobile{
    Mi(){
        System.out.println("Cheap");
    }
    public void videoCalling(){
         System.out.println("videoCalling........");
     }
     public void playStore(){
         System.out.println("Installing........");
     }   
}

public class Inheritance {
    public static void main(String[] args) {
        //super-sub
        Nokia5 o=new Nokia5();
        
        
        
        
        
       
    
}
    
}
