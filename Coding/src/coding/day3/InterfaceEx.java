/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//fields are public, static and final by default, and the methods are public and abstract
package coding.day3;
interface Theater{
    
    int totalSeat=500;
    default void greeting(){
        System.out.println("'''''''''''''''''''''''''  Welcome To Inox ............................");
        
    }
    static void qoute(){
        System.out.println("....................'....We Will Statisfy you..............");
        System.out.println("........With Our Service & Environment.......");
    }
    void screen1();
    void screen2();
    void screen3();
}
interface Place extends Theater{
    void Canteen();
    void parking();
    void shop();
}
class Name implements Place{
    int seat;
    @Override
    public void screen1(){
        System.out.println("Karanan....Showing");
    }
    @Override
    public void screen2(){
        System.out.println("Master.....Showing");
    }
    @Override
    public void screen3(){
        System.out.println("Doctor.....Showing");
    }
    public void Canteen()
    {
     Hotel.drink();
    }
    public void parking()
    {
    System.out.println("Available");
    }
    public void shop()
    {
    System.out.println("opened..");
    }
    
}

public class InterfaceEx {
    public static void main(String[] args) {
        Name inox=new Name(); 
        
        inox.greeting();
        Theater.qoute();
        inox.parking();
        inox.screen1();
        inox.screen2();
        inox.screen3();
        inox.Canteen();
        inox.shop();
        inox.parking();
        System.out.println("        Thank You   ");
        System.out.println("WAITING  FOR YOUR VISIT AGAIN");
    }
}
