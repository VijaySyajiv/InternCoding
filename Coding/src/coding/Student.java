/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.util.*;
/**
 *
 * @author Lenovo
 */

public class Student {
  
     static String collegeName="TCE";
     int rollNo=100;
     static int totalStudent;
     String studentName;
    Student(String studentName){
        this.studentName=studentName;
        this.rollNo=rollNo+totalStudent;
        totalStudent++;
    }
    static void  studentList(Student[] student){
        for(int i=0;i<totalStudent;i++){
            System.out.println(student[i]);
        }
    }
    
     @Override
    public String toString(){
        return studentName+"    "+rollNo+"    "+collegeName;
    }
    static{
        totalStudent=0;
        System.out.println("Thiagarajar College Of Engineering");
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Total number of Student");
        int n=InputValidation.integerValidation();
         Student[] student=new Student[n];
        for(int j=0;j<n;j++){
            System.out.println("Enter the "+(j+1)+" student name");
            String temp=in.next();
            student[j] =new Student(temp);
           
        }
        Student.studentList(student);
    }
    
    
}
