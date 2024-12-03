package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//kckcb//Desktop//hello.txt");
		int data;
		while((data=file.read())!=-1) {
			System.out.print((char)data);
			
		}
		
	}
}
