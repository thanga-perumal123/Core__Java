package Array;

public class Mode {
	public static int mode(int []arr)
	{
		int maxValue=0,maxCount=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					
					count++;
					
			}
			if(count>maxCount)
			{
				maxCount=count;
				maxValue=arr[i];
			}
		
		
		}
	return maxValue;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,4,7,2,1,5,2,4};
		System.out.println("Mode "+mode(arr));

	}

}
