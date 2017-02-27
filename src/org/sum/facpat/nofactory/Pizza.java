package org.sum.facpat.nofactory;

public class Pizza {

	protected String type;
	
	public void prepare(){
		System.out.println(type + " Pizza preparing.");
	}
	
	public void bake(){
		System.out.println(type + " Pizza baking.");
	}
	
	public void cut(){
		System.out.println(type + " Pizza cutting.");
	}
	
	public void box(){
		System.out.println(type + " Pizza boxing.");
	}
}
