/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
// only one instance can be created for Singleton class
public class Singleton {
    static Singleton instance=null;
     int x;
    private Singleton(int x){ 
        System.out.println("object Created Successfully");
        this.x=x;
       
    }
    public static Singleton getInstance(int x){
        if(instance==null){
            return instance=new Si ngleton(x);
        }
        return instance;
    }
    
}
class Checker{
    public static void main(String[] args) {
        Singleton object1= Singleton.getInstance(10);
        System.out.println(object1.x);
        Singleton object2= Singleton.getInstance(41);
        System.out.println(object1.x);
        
    }
     
}