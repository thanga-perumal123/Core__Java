package Numbers;

public class Automorphic {
	public static boolean auto(int num)
	{
		int squre=0;
		squre=num*num;
		
		while(num>0) {
		if(num%10!=squre%10)
		{
			return false;
		}
		num=num/10;
		squre=squre/10;}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		if(auto(num))
		{
			System.out.println(num+" is Automorphic number");
		}
		else
		{
			System.out.println(num+" is not Automorphic");
		}

	}

}
