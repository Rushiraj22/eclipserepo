package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConsolIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		try {
//			int i;
//			System.out.println("Enter 'q' to stop:");
//			while((i=b.read())!='q')
//			{
//				System.out.print(i+":");
//				System.out.println((char)i);
//			}
//			b.close();

			String l;
			System.out.println("Enter 'stop' to quit:");
			
			while(!((l=b.readLine()).equals("stop")))
			{
				System.out.println(l);
			}
			b.close();

		} catch (Exception e) {

		}
	}

}
