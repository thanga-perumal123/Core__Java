package Numbers;
import java.util.*;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(isPrime(num))
		{
			int rev=0;
			while(num>0)
			{
				rev=rev*10+num%10;
				num/=10;
			}
			if(isPrime(rev))
			{
				System.out.println("The Number is TwistedPrime");
			}
			else
				System.out.println("The Number is Not TwistedPrime");
		}
		else
			System.out.println("The Number is Not a TwistedPrime");
		

	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
			
		}
		return true;
	}

}
