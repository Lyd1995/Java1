public class PrimeNumber{
	public static void main(String[] args){
		final int NUMBER_OF_PRIME=50;
		int number=2,count=0;
		
		while(count<NUMBER_OF_PRIME)
		{
			int n=2;
			boolean isprime=true;
			while(n<=number/2)
			{
				if(number%n==0)
				{
					isprime=false;
					break;
				}
				n++;
			}
			if(isprime)
			{
				System.out.println(number);
				count++;
			}
			number++;
		}
	}
}
//java
