package Array;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []seq= {1,2,3,4,5};
		int input=4;
		int []result=newSeq(seq,input);
		for(int i:result)
		{
			System.out.println(i+" ");
		}

	}
	public static int[] newSeq(int []seq,int input)
	{
		int result[]=new int[5];
		int startInd=input%seq.length;
		int idx=0;
		for(int i=startInd-1;i<seq.length;i++)
		{
		    result[idx]=seq[i];
		    idx++;
		}
		for(int i=0;i<startInd-1;i++)
		{
			result[idx]=seq[i];
			idx++;
		}
		return result;
	}

}
