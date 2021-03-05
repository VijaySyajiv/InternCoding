package coding.day4;

import java.util.Scanner;

public enum Department {
	ASSIST(10),DESK(9),PEOPLE(8),CLIQ(9);
	private int value;  
	private Department(int value){  
	  this.value=value;
	}
	public static void display() {
		for(Department e:Department.values()) {
			System.out.println((Department.valueOf(String.valueOf(e)).ordinal()+1)+"- "+Department.valueOf(String.valueOf(e)));
		}
	}
	public static String departmentNameValidator() {
		while(true){
			try {
				Scanner in =new Scanner(System.in);
				String deptName=in.next();
				
				Department value= Department.valueOf(deptName);
				return String.valueOf(value);
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Please type the name correctly");
				continue;
			}
		}
	}
	public static void main(String[] args) {
		for(Department e:Department.values()) {
			System.out.println(Department.valueOf(String.valueOf(e))+" value - "+e.value+" index - "+Department.valueOf(String.valueOf(e)).ordinal());
		}
		
	} 

}
