package Numbers;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=80;
		System.out.println("The factors of "+number+" is:");
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				System.out.println(i+" ");
		}

	}

}



