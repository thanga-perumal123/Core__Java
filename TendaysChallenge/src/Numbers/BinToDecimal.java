package Numbers;

public class BinToDecimal {
	public static int todecimal(int binary)
	{
	int decimal=0;
	int n=0;
	while(true)
	{
		if(binary==0)
			
		{
			break;
		}
		else
		{
		int temp=binary%10;
		decimal=(int) (decimal+temp*Math.pow(2,n));
		binary=binary/10;
		n++;
		}
	}
		return decimal;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary=1010;
		System.out.println("The decimal number is"+todecimal(binary));
		System.out.println(Integer.parseInt("1100",2));

	}

}
