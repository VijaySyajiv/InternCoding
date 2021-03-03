/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.demo;


public class Mobile {
    public String mobileColour;
    public int price;
    Mobile(){
        this.mobileColour="gold";
        this.price=5000;
    }
    public Mobile(String mobileColour,int price ){
        this.mobileColour=mobileColour;
        this.price=price;
    }
    public void camera(){
        System.out.println("Image Captured...........");
    
    }
    protected void calling(){
        System.out.println("Calling...........");
    
    }
    private void gallery(){
        System.out.println("Image...........");
    
    }
    void whatsApp(){
        System.out.println("msg...........");
    }
    public static void main(String[] args) {
        Mobile nokia=new Mobile("black",10000);
        nokia.gallery();
        nokia.calling();
        nokia.camera();
    }
    
    
}
