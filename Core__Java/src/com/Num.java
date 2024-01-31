package com;

import java.util.stream.IntStream;

public class Num {
	public static void main(String args[])
	{
		//print o=new print();
		//o.printnum(1,101);
		//int one='a'/'a';
		/*String s="abcdefghij";
		int hundred=s.length()*s.length();
		for(int i=one;i<=hundred;i++)
		{
			System.out.println(i);
		}*/
		/*for(int i=one;i<='d';i++)
		{
			System.out.println(i);
		}*/
	    /*String s="abcdefghij";
	    int one=s.length()-s.length();
	    int hundred=s.length()*s.length();
	    for(int i=one;i<=hundred;i++)
	    {
	    	System.out.println(i);
	    }*/
		IntStream.range(1,101).forEach(e ->System.out.println(e));
	}
}
 class print{
		public  void printnum(int st,int end)
		{
			if(st<=end)
			{
				System.out.println(st);
				st++;
				printnum(st,end);
			}
		}
	}




