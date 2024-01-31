package Numbers;

public class Factorial {
	static int facto(int n)
	{
		if(n<=1)
			return 1;
		//int fact=1;
		/*for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}*/
		return n*facto(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		int sum=facto(num);
		System.out.println("The factorial of " +num+" is "+sum);

	}

}
