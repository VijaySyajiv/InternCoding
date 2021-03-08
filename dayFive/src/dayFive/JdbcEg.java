package dayFive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class JdbcEg {
	
	public static void main(String[] args) throws Exception {
		
		List<Employee> zoho=new ArrayList<>();
		String url="jdbc:mysql://localhost:3306/zohoemployee";
		String uname="root";
		String pass="";
		//Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,uname,pass);
//		Statement sat=con.createStatement();
//		ResultSet rs=sat.execute();
		
		
		while(true) { 
					Scanner in =new Scanner(System.in);
					System.out.println("choose the option..........");
					System.out.println("1- Add\n2- remove \n3 -Salary_update\n4 -Phone number update \n5 -display_Employee_Detail");
					int option=InputValidation.integerValidation();
					
					if(option==1) {
						Employee object =Employee.Details();
						PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
						employeeDetailsInput(st,object);
					}
					if (option==2) {
						displayEmployeeDetails(con);
						System.out.println("Enter the ID of the person to delete");
						int id=in.nextInt();
						PreparedStatement st=con.prepareStatement("delete from employee where id=?");  
						st.setInt(1,id);  
						int i=st.executeUpdate();  
						displayEmployeeDetails(con);
						System.out.println(i+" records deleted");  
		
					}
					if(option==3) {
						displayEmployeeDetails(con);
						System.out.println("Enter the ID of the Employee to update the salary");
						int id=in.nextInt();
						System.out.println("Enter the salary to update");
						int salary=in.nextInt();
						
						PreparedStatement st=con.prepareStatement("update employee set salary=? where id=?");  
						st.setLong(1,salary);//1 specifies the first parameter in the query i.e. name  
						st.setInt(2,id); 
						st.executeUpdate();  
						System.out.println(" Records Updated");  
						
						displayEmployeeDetails(con);
					} 
					if(option==4) {
						displayEmployeeDetails(con);
						System.out.println("Enter the ID of the Employee to update the Phone number");
						int id=in.nextInt();
						System.out.println("Enter the Phone number to update");
						int phoneNumber=in.nextInt();
						
						PreparedStatement st=con.prepareStatement("update employee set phoneNumber=? where id=?");  
						st.setLong(1,phoneNumber);;//1 specifies the first parameter in the query i.e. name  
						st.setInt(2,id); 
						st.executeUpdate(); 
						System.out.println(" Records Updated");  
						
						displayEmployeeDetails(con);
					}
					if(option==5) {
						displayEmployeeDetails(con);
					}
			}
			
				
		}
	
	public static void employeeDetailsInput(PreparedStatement st,Employee e)throws Exception {
		st.setInt(1,0); 
		st.setString(2,e.name);
		st.setLong(3,e.phonNumber);
		st.setInt(4,e.age);
		st.setString(5,e.dpt);
		st.setLong(6,e.salary);
		System.out.println(e.salary);
		st.executeUpdate();  
		System.out.println(" Records Inserted");  
	}
	public static void  displayEmployeeDetails(Connection con) throws Exception {
		PreparedStatement st=con.prepareStatement("select * from employee");
		ResultSet rs=st.executeQuery();
		System.out.println("EMP_ID    EMP_NAME   EMP_Ph_NO   EMP_AGE   EMP_DEPT   EMP_SALARY");
		while(rs.next()){  
		System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"     "+rs.getLong(3)+"            "+rs.getInt(4)+"           "+rs.getString(5)+"     "+rs.getLong(6));  
		}  
	}
 
}
