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
public class Conversion {
    public static void main(String[] args) {
//        float number=9.0f;
//        Integer i = new Integer((int)Math.ceil(number));
          Float value = new Float(30.7f);
                  
          System.out.println("int value  - "+value.intValue());
          System.out.println("double value  - "+value.doubleValue());
          System.out.printf("double value %.2f - \n",value.doubleValue());
          System.out.println("long value   - "+value.longValue());
          System.out.println("short value   - "+value.longValue());

    }
}
