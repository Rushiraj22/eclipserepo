package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream is= new FileInputStream("C:\\Users\\rushi\\OneDrive\\Documents\\");
		
		int i;
		
		while((i=is.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		is.close();

	}

}
