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
        System.out.println(System.getProperty("user.name"));

    }
    
}
//java.version         Java version number
//java.vendor          Java vendor specific string
//java.vendor.url      Java vendor URL
//java.home            Java installation directory
//java.class.version   Java class version number
//java.class.path      Java class path
//os.name              Operating System Name
//os.arch              Operating System Architecture
//os.version           Operating System Version
//file.separator       File separator ("/" on Unix)
//path.separator       Path separator (":" on Unix)
//line.separator       Line separator ("\n" on Unix)
//user.name            User account name
//user.home            User home directory
//user.dir             User's current working directory