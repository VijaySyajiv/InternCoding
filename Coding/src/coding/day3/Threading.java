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
class Queue extends Thread{
    Thread t1;
    
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(this.getName()+" person - "+i);
                try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
    }
        
    }
}
public class Threading {
    public static void main(String[] args) {
        
        Queue t1=new Queue();
        Queue t2=new Queue();
        Queue t3=new Queue();
        t1.setName("100 Rupess");
        t2.setName("50  Rupess");
        t3.setName("Free");
        t1.setPriority(Thread.MAX_PRIORITY); //0 t0 10 priority levels
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        //t1.start();//throws IllegalThreadStateException
        //t1.run(); // it doesn't create seprate call stack
//        try{
//            t1.join(1500);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start(); 
        System.out.println(t2.getId());
        try{
            t2.join(20000);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
        //before we want to make the daemon thread to true////// all the user threads dies, JVM terminates this thread automatically.
        //if all the thread exited means the jvm exit the daemon thread automatically
        t3.setDaemon(true);
        t3.start();
        
    }
}
