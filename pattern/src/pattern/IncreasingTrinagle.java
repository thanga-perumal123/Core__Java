package pattern;

public class IncreasingTrinagle {
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	public static void main(String args[])
	{
		int num=5;
		print(num);
	}

}
