package Numbers;

public class DecToBinary {
	public static void tobinary(int dec)
	{
	  int binary[]=new int[30];
	  int i=0;
	  while(dec>0)
	  {
		  binary[i]=dec%2;
		  dec=dec/2;
		  i++;
		  
	  }
	  for(int j=i-1;j>=0;j--)
	  {
		  System.out.println(binary[j]);
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal=10;
		System.out.println("The binary number of "+decimal+ "is");tobinary(decimal);
        System.out.println(Integer.toBinaryString(12));
	}

}
