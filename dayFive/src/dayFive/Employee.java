package dayFive;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int phonNumber;
	int age;
	static int total;
	String dpt;
	int salary;
	public Employee(String name, int phonNumber, int age, String dpt, int salary) {
		//super();
		
		this.name = name;
		this.phonNumber = phonNumber;
		this.age = age;
		this.dpt = dpt;
		this.salary = salary;
	}
	public Employee(int id,String name, int phonNumber, int age, String dpt, int salary) {
		//super();
		
		this.name = name;
		this.phonNumber = phonNumber;
		this.age = age;
		this.dpt = dpt;
		this.salary = salary;
	}
	 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getPhonNumber() {
		return phonNumber;
	}
	public int getAge() {
		return age;
	}
	public String getDpt() {
		return dpt;
	}
	public int getSalary() {
		return salary;
	}
	public void setPhonNumber(int phonNumber) {
		this.phonNumber = phonNumber;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ", phonNumber=" + phonNumber + ", age=" + age + ", dpt=" + dpt + ", salary="
				+ salary;
	}
	
	public static Employee Details() {
	  Scanner in =new Scanner(System.in);
		int age,salary,phoneNumber;
		String name,dept;
		 
		System.out.println("employee "+(++Employee.total));
		
		System.out.println("enter the name");
		name=in.next();
		System.out.println("enter the phone number");
		phoneNumber=InputValidation.integerValidation();
		System.out.println("enter the age");
		age=InputValidation.integerValidation();
		Department.display();
		dept=Department.departmentNameValidator();
		System.out.println("enter the salary");
		salary=4;InputValidation.integerValidation();
		Employee object =new Employee(name,phoneNumber,age,dept,salary);
		//in.close();
		return object;
	}
	
	
}

