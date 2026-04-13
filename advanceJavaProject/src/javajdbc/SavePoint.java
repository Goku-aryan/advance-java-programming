package javajdbc;

import java.sql.*;

public class SavePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		 String host = "jdbc:mysql://localhost:3307/mysql1";
	        String username = "root";
	        String password = "mysql";
	        Savepoint sp1 = null ,sp2 = null;
	        Connection con = null;
	        String create_Table = """
	        CREATE TABLE IF NOT EXISTS employee(id INT PRIMARY KEY AUTO_INCREMENT, 
	        name VARCHAR(50) NOT NULL, dept VARCHAR(50), salary DECIMAL(10,2))
	        """;
	        
	        try {
	            Class.forName(driver_name);
	            
	            con = DriverManager.getConnection(host,username, password);
	            
	            Statement smt  = con.createStatement();
	            con.setAutoCommit(false);
	            int rowAffected  = smt.executeUpdate("""
	                  insert into employee
	                  (name,dept, salary) values('Emp4','IT',47000),('Emp5','Account',70000),('Emp6','IT','61000')
	                  """);
	            
	                 sp1 = con.setSavepoint("inserted");
	             
	            rowAffected = smt.executeUpdate("""
	            		 update employee set salary = 100000 where name = "Emp3" 
	            		 """);
	            
	            
	            	sp2 = con.setSavepoint("updated");
	            
	            //CallableStatement cstmt = con.prepareCall("{call showEmployees()}");
	            
	           // ResultSet rs = cstmt.executeQuery();
	            
	            smt.executeUpdate("""
	            		delete from employee where id = 2
	            		""");
	            
	            con.commit();
	            
	            con.setAutoCommit(true);
	            
	}
	        catch (ClassNotFoundException | SQLException e){
	        	try {
	        	con.rollback(sp2);
	        	con.commit();
	        }catch(SQLException e1) {
	        	e1.printStackTrace();
	        }
	        	e.printStackTrace();

}}}
