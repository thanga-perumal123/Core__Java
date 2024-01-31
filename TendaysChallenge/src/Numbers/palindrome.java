package Numbers;

import java.util.Scanner;

public class palindrome {
	public static int pali(int n)
	{
		int rev=0;
		while(n>0)
		{
		 rev=rev*10+n%10;
		 n=n/10;
		}	
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int reverse=pali(n);
		if(reverse==n)
		{
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}
		sc.close();

	}

}
