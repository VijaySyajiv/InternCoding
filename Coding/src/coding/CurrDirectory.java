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
public class CurrDirectory {
    public static void main(String[] args) {

        String path = System.getProperty("user.dir");
        String currentUsersHomeDir = System.getProperty("user.home");
        
        System.out.println("Working Directory = " + path);
        System.out.println("current User HomeDir  "+currentUsersHomeDir);

    }
    
}
