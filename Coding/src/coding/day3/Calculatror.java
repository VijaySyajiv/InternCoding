/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.day3;
class Addition{
    public int add(int x,int y){
        System.out.println("2 integer adding");
        return x+y;
        
    }
    public int add(int x,int y,int z){
        System.out.println("3 integer adding");
        return x+y+z;
        
    }
   
}
class Addition1{
     public float add(float x,int y){
        return x+y;
        
    }
}
public class Calculatror {
    public static void main(String[] args) {
        //changing parameters and changing parameter return type
        Addition object1=new Addition();
        object1.add(5,6);
    }
    
}
