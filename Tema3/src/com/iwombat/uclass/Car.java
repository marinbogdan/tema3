package com.iwombat.uclass;
import com.iwombat.exceptions.Exceptions;
import com.iwombat.uclass.AutoVehicle;

public class Car extends AutoVehicle {

	public Car(int speed,String nr,int litri){
		super(speed,nr,litri);
		this.fuel="gasoline";
		 
	 }

	public void viewTheMaxSpeed() {
		
	}
	public void showDetail(){
		System.out.print("Fuel: "+this.fuel);
		System.out.print("  Litri: "+this.litri);
		System.out.print("  Number of registration: "+this.numberOfRegistration);
		System.out.print("  MaxSpeed "+this.speedMax);

	}

	@Override
	public void startEngine() throws Exceptions {
		// TODO Auto-generated method stub
		
	}
	
}
