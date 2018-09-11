import java.util.Scanner;
public class CheckPalindrome {
	public static void main(String[] args) {
		java.util.Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s=input.nextLine();
		
		if(isPalindrome(s))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");	
	}
	
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
