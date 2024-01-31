package Numbers;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=39,b=12;
		int temp=a;
		int temp1=b;
		//int gcd=1;
		/*for(int i=1;i<=a && i<=b;i++)
		{
		if(a%i==0 && b%i==0)
			gcd=i;
		
		
		}
		while(b!=0)//while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}*/
     System.out.println("Gcd of "+temp+" and "+temp1+" is "+findgcd(a,b));	}
	public static int findgcd(int a,int b)
	{
		if(b==0)
			return a;
		return findgcd(b,a%b);
	}

}
