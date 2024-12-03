package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FileWith_DB {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C://Users//kckcb//Downloads//student.csv");
		BufferedReader br = new BufferedReader(file);
		
		String line;
		br.readLine();
		
		 
		 while((line=br.readLine())!=null) {
			String []data = line.split(",");

			 try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","@Mysql7799");
					String sql = "insert into students(fname,lname,age,city) values('"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"')";
					Statement stm = con.createStatement();
					stm.execute(sql);
				} catch (Exception e) {
					e.printStackTrace();
				}
		 }
		
	
		  
	}

}
