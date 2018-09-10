public class CountLettersInArray{
	public static char getRandomCharacter(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}

	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	
	public static void main(String[] args){
		char[] ch=new char[105];
		int[] count=new int[26];
		for(int i=0;i<100;i++){
			ch[i]=getRandomLowerCaseLetter();
			count[ch[i]-'a']++;
		}
		
		for(int i=0;i<26;i++)
			System.out.println("The number of letter "+(char)(i+'a')+" in array is "+count[i]);
	}
}
		
