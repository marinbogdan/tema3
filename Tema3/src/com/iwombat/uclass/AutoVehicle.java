package com.iwombat.uclass;

import com.iwombat.exceptions.Exceptions;
import com.iwombat.uinterface.Practicable;


public abstract class AutoVehicle implements Practicable {
	int speedMax;
	String fuel;
	int litri;
	String numberOfRegistration;
	abstract void viewTheMaxSpeed();
	public abstract void showDetail();
	public void getFuel(int nr) throws Exceptions
	{
		this.litri=this.litri+nr;
		if(litri<0)
			throw new Exceptions("Negative fuel");
	}
	public AutoVehicle(int speed,String nr,int litri)
	{
		this.speedMax=speed;
		this.numberOfRegistration=nr;
		this.litri=litri;
	}
	public boolean hasGasoline()
	{	
			if(litri==0)
				return false;
			else
				return true;	
	}
	public boolean hasDiesel()
	{
		if(litri==0)
			return false;
		else
			return true;
	}
	public void startEngine() throws Exceptions
	{
		if (hasGasoline()==false) 
				throw new Exceptions("Do not have gas");
		else
			{
			System.out.println();
			System.out.println("Engine start!!");
			}
	}
}
