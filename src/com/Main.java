package com;

import java.util.HashMap;
import java.util.Map;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	HashMap<String,Integer> hm=new HashMap<String,Integer>(10,0.5f);
	hm.put("Raju", 20);
	hm.put("Perumal", 22);
	hm.put("Sankar", 25);
	/*System.out.println(hm.size());
	System.out.println(hm);
	
	System.out.println((hm.containsKey("Raju")));
	 
	Integer a=hm.get("Raju");
	System.out.println(a);
	System.out.println(hm.containsValue(20));*/
	
	HashMap<String,Integer> hm1=new HashMap<String,Integer>(hm);
	
	//hm1.put("Raja", 20);
	//hm1.put("Peranmbu", 22);
	//hm1.put("Sanki", 25);
	
	System.out.println("First Hash Map: "+hm);
	System.out.println("Second hash Map:"+hm1);
	
	for(Map.Entry<String,Integer> e:hm.entrySet())
	{
	System.out.println("NAme:"+e.getKey()+"   "+"Age:"+e.getValue());	
	}
	System.out.println(hm.isEmpty());
	for(String i:hm.keySet())
	{
		System.out.println("key:  "+i +"  "+hm.get(i));
		
	}
	
	
	
	
	
	}
	

}
