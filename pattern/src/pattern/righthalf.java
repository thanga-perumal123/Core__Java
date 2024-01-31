package pattern;

public class righthalf {
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)//Revers-for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
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
