/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.day3;

import coding.InputValidation;

class NoteValidater extends Exception{
    NoteValidater(String string){
        super(string);
    }
    
}
public class ExceptionEx {
    public void atm(int amount) throws NoteValidater{
        if(!(amount%100==0)){
            throw new NoteValidater("Invalid amount ");
        }
        else
        {
            System.out.println("Collect Your Money");
        }
    
  }
    public static void main(String[] args)throws Exception {
        try{
            
            ExceptionEx obj=new ExceptionEx();
            int amount=0;
            
            System.out.println("Enter the amount in multiple of 100");
            try{                
                amount=InputValidation.integerValidation();
            }
            catch(Exception e){
                System.out.println(e);                
            }
            obj.atm(amount);
           
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        finally{
            System.out.println("Thank You For Banking With Us ");
            System.out.println("WAITING  FOR YOUR VISIT AGAIN");
        }
    }
}
