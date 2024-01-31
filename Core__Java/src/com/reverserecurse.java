package com;

public class reverserecurse {
 
	public static void main(String args[])
	{
		
	String str="Thanga Perumal";
	printreverse(str,str.length()-1);
	}
	public static void printreverse(String s,int pos)
	{
		if(pos>=0)
		{
			System.out.print(s.charAt(pos));
			printreverse(s,pos-1);
		}
	}
	
} 
