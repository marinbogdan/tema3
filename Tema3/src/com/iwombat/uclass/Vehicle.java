package com.iwombat.uclass;
import com.iwombat.exceptions.Exceptions;
import com.iwombat.uinterface.Practicable;

public abstract class Vehicle implements Practicable {
	String owner;
	public Vehicle(String name)
	{
		this.owner=name;
	}
	public abstract void setTheOwner(String name);
	public abstract void view();
	public boolean hasGasoline() //throws exceptions
	{
		return false;
		//throw new exceptions("The name of the student is invalid");
	}
	public boolean hasDiesel() //throws exceptions
	{
		return false;
	}
	public void startEngine() throws Exceptions
	{
		if (hasGasoline()==false)
			throw new Exceptions("Do not have engine");
		else
			System.out.println("Engine start!!");
	}
}
