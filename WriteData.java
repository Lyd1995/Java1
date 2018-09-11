
import java.io.File;
import java.io.FileNotFoundException;

public class WriteData {
	public static void main(String[] args) {
		java.io.File file=new java.io.File("scores.txt");	
		if(file.exists())
		{
			System.out.println("File is exists ");
			System.exit(0);
		}
		
		java.io.PrintWriter output;
		try {
			output = new java.io.PrintWriter(file);
			output.print("John T Simth ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
			
			output.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		System.out.println("Does it exists ? "+file.exists());
		System.out.println("The file has "+file.length()+" bytes ");
		System.out.println("Can it be read ?  "+file.canRead());
		System.out.println("Can it be Writed ? "+file.canWrite());
		System.out.println("Is it a directory ? "+file.isDirectory());
		System.out.println("Is it a file ? "+file.isFile());
		System.out.println("Is it absolute ? "+file.isAbsolute());
		System.out.println("Is it hidden ? "+file.isHidden());
		System.out.println("Absolute payh is "+file.getAbsolutePath());
		System.out.println("Last modified on "+new java.util.Date(file.lastModified()));
	}
}
