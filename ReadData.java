import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadData {
	public static void main(String[] args) {
		java.io.File file=new java.io.File("scores.txt");
		
		try {
			java.util.Scanner input=new java.util.Scanner(file);
			while(input.hasNext()) {
				String firstName=input.next();
				String mi=input.next();
				String lastName=input.next();
				
				int score=input.nextInt();
				System.out.println(firstName+" "+mi+" "+lastName+" "+score);	
			}
			input.close();
		} 
		catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}	
	}
}
