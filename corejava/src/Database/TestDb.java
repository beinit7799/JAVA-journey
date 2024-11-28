package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDb {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(url,un,psn)
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
		 
		/* //do transaction
		 //1. write sql
		 String sql = "insert into tbl1(username,password)values('hari','12345')";
		 //2. create statement
		 Statement stm = con.createStatement();
		 //3. execute sql
		 stm.execute(sql);
		 // close db 
		 con.close();
		 System.out.println("Sucess");
		 */
		
		 /*String sql1 = "UPDATE tbl1 SET username='binit 'WHERE id=1 ";
		 Statement stm = con.createStatement();
		 stm.execute(sql1)
		 */
		 
		/* String sql = "DELETE FROM tbl1 WHERE (id=3)";
		 Statement stm = con.createStatement();
		 stm.execute(sql);
		 con.close();
		 System.out.println("Sucess");
		 */
		 
		 //----------------select--------------------------------
		 String sql1 = "select * from tbl1";
		 Statement stm1 = con.createStatement();
		 ResultSet rs = stm1.executeQuery(sql1);
		 
		 
		 while(rs.next()) {
			 System.out.println("ID="+rs.getInt("id"));
			 System.out.println("Username="+rs.getString("username"));
			 System.out.println("Passeord="+rs.getString("password"));
		 }
	}
}
