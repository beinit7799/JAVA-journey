package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	public static void main   (String[] args) throws IOException{
		/*
		 * a> FileInputStrean:read file.
		 * b> FileOutputString:write file.
		 */
		FileOutputStream file = new FileOutputStream("C://Users//kckcb//Desktop//hello.txt");
		file.write("goodmorning".getBytes());
		file.close();
		System.out.println("Sucess");
	}

}
