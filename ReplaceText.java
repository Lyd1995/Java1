import java.util.*;
import java.io.*;

public class ReplaceText {
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File sourceFile=new java.io.File(args[0]);
		java.io.File targetFile=new java.io.File(args[1]);
		
		
		java.util.Scanner input=new java.util.Scanner(sourceFile);
		java.io.PrintWriter output=new java.io.PrintWriter(targetFile);
		
		while(input.hasNextLine())
		{
			String string=input.nextLine();
			
			output.println(string.replaceAll(args[2], args[3]));
		}
		input.close();
		output.close();
		
	}
}
