package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateTest {
	/*
	 * a>FileReader
	 * b>FileWriter
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter  file = new FileWriter("C://Users//kckcb//Desktop//student.txt",true);
		file.write("Name = ram\n");
		file.write("Age = 20\n");
		file.write("College = NCIT\n");
		file.write("Phone = 9823779722");
		file.write("City = ktm\n");
		
		file.close();
		System.out.println("sucess");
		
	}
}
