package Numbers;

public class Armstrong {
	public static void main(String args[])
	{
		int n=153;
		int rev=0;
		int temp=n;
		while(n>0)
		{
		int rem=n%10;
		rev=rev+(rem*rem*rem);
		n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp +" is a Armstrong number" );
		}
		else
		{
			System.out.println(temp +" is a not armstrong");
		}
		

	}

}
