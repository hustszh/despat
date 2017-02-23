package org.sum.decpat;

public abstract class Component {

	protected String description = "Unkown";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
