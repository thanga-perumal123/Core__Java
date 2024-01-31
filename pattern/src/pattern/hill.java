package pattern;

public class hill {
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++);
			{
				System.out.print("* ");
			}
			//for(int j=1;j<=i;j++)
			//{
				
				//System.out.print("* ");
			//}
			System.out.println();
		}
		//for(i=n)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		print(num);

	}

}
