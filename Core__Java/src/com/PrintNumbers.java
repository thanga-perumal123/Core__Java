package com;

import java.util.Arrays;

public class PrintNumbers {
	public static void main(String args[])
	{
		Object num[]=new Object[100];
		Arrays.fill(num, new Object() {
			int count=0;
			public String toString() {
				return Integer.toString(++count);
			}
			
			
		});
		System.out.println(Arrays.toString(num));
	}

}
