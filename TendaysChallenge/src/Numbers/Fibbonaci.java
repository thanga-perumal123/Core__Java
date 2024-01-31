package Numbers;

public class Fibbonaci {
	/*public static int fib(int num)
	{
	if(num<=1)
		return num;
	return fib(num-1)+fib(num-2);
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int n1=0,n2=1,n3;
		/*for(int i=0;i<num;i++)
		{
			System.out.print(fib(i)+" " );
		}
		*/int i=0;
		while( i<num)//for(int i=0;i<num;i++)
		{
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;n2=n3;
			i++;
			
		}
		

	}

}
