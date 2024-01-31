package com;

public class reverse {
	public static void main(String args[])
	{
		String input="Thanga Perumal";
		
		/*String rev="";
		char[] ch=new char[20];
		ch=input.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		     rev=rev+ch[i];
		}
		System.out.println(rev);
		
		//String reverse="";
		/*char ch;
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			 reverse=ch+reverse;
			
		}
		System.out.println(reverse);*/
		
		StringBuilder sb=new StringBuilder();
		sb.append(input);
		sb.reverse();
		String rev=sb.toString();
		System.out.println(rev);
	}

}
