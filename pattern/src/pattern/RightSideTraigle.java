package pattern;

public class RightSideTraigle {
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");			}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		print(num);

	}

}
