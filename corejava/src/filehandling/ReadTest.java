package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C://Users//kckcb//Desktop//student.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line;
		
		 while((line=br.readLine())!=null) {
			 System.out.println(line);
		 }
	}

}
