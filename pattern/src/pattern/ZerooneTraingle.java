package pattern;

public class ZerooneTraingle {
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(0+" ");
				}
				else {
					System.out.print(1+" ");
				}
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
