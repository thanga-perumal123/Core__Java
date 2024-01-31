package com;
//Encapsulation in java

 class person{
	 private int age;
	 private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//public void setName(String name) {
		//this.name = name;
	//}
	 
 }
 public class Demo {
	 public static void main(String args[]) {
		person p=new person();
	    p.setAge(20);
	    //p.setName("Raju");
	    System.out.println("Name:"+p.getName()+"   \n   "+"Age:"+p.getAge());
	 }
	    
		
		
		
		

	}
