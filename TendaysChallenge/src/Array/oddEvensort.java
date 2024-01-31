package Array;
import java.util.*;
public class oddEvensort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {5,6,3,8,7,9,4,2};
		oddEven(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]+" ");
		}
	}
		public static void oddEven(int []nums)
		{
		List<Integer> odd=new ArrayList<Integer>();
		List<Integer> even=new ArrayList<Integer>();
		
		for(int i:nums)
		{
			if(i%2==0)
			{
				even.add(i);
			}
			else
				odd.add(i);
		}
		Collections.sort(odd,Collections.reverseOrder());
		Collections.sort(even);
		int oddIdx=0;int evenIdx=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
			{
			nums[i]=even.get(evenIdx);
			evenIdx++;
			}
			else {
				nums[i]=odd.get(oddIdx);
				oddIdx++;
			}
		}
		/*int i=0;
		for(int j=0;j<odd.size();j++)
		{
			nums[i]=odd.get(j);
			i++;
			}
		for(int j=0;j<even.size();j++)
		{
		   nums[i]=even.get(j);
		   i++;
		}*/


	}
	

}
