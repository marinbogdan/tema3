package com.iwombat.uclass;
import com.iwombat.exceptions.Exceptions;
import com.iwombat.uclass.Vehicle;


public class Bicycle extends Vehicle {
	
	public void getFuel(int nr) throws Exceptions
	{
		if (this.hasDiesel()==false)
			throw new Exceptions("You can't put fuel");
	}
	public Bicycle(String name) {
		super(name);
	}
	public void setTheOwner(String name)
	{
		this.owner=name;
	}
	public void view()
	{
		System.out.println(" Owned by : "+this.owner);
	}

}
