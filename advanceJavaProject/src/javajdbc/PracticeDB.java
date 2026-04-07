package javajdbc;

import java.sql.*;

public class PracticeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		 String host = "jdbc:mysql://localhost:3307/mysql1";
	        String username = "root";
	        String password = "mysql";
	        String create_Table = """
	        CREATE TABLE IF NOT EXISTS employee(id INT PRIMARY KEY AUTO_INCREMENT, 
	        name VARCHAR(50) NOT NULL, dept VARCHAR(50), salary DECIMAL(10,2))
	        """;
	        
	        try {
	            Class.forName(driver_name);
	            System.out.println("Driver ready");
	            Connection con = DriverManager.getConnection(host,username, password);
	            System.out.println("Host is ready");
	            //Statement smt  = con.createStatement();
	            Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	            smt.execute(create_Table);
	            System.out.println("Table is ready");
//	            int rowAffected  = smt.executeUpdate("""
//              insert into employee
//              (name,dept, salary) values('Emp1','IT',45000),('Emp2','IT',40000),('Emp3','IT','60000')
//              """);
//             if(rowAffected > 0){
//                 System.out.println("Record inserted");
//             } else {
//                 System.out.println("Record was not inserted");
//             }
            ResultSet rs  = smt.executeQuery("select * from employee");
            
            while(rs.next()) {
            	long salary = rs.getLong("salary");
            	if(salary <= 50000) {
            		rs.updateDouble("salary", salary*1.1);
            		rs.updateRow();
            	}
            }
            rs.afterLast();
            System.out.println(" ID| Name |Dept| Salary");
            while(rs.previous()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                long salary = rs.getLong("salary");
                System.out.println(String.format(" %d | %s | %s | %d",id,name,dept,salary));
            }
        } catch (ClassNotFoundException | SQLException e){

        }
	}

}
