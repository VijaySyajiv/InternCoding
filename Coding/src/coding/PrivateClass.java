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
public class PrivateClass {
    private class InnerClass1{
        public  void working (){
            System.out.println("private class called");
        }
        
    }
     protected class InnerClass2{
        public  void working (){
            System.out.println("protected class called");
        }
        
    }
     public  void working (){
            System.out.println("public class called");
            InnerClass1 innerObject=new InnerClass1();
            innerObject.working();
            InnerClass2 innerObject2=new InnerClass2();
            innerObject2.working();
        }
    
}
class checking{
    public static void main(String[] args) {
        PrivateClass object=new PrivateClass();
        object.working();
    }
    
}
