package Numbers;

public class prime {
	public static boolean pri(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
			
		  return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17;
		if(pri(num))
		{
			System.out.println(num+" is prime ");
		}
		else
		{
			System.out.println(num+" is not a prime");
		}

	}

}
