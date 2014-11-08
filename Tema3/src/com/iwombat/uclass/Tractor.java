package com.iwombat.uclass;
import com.iwombat.uclass.AutoVehicle;

public class Tractor extends AutoVehicle {

 public Tractor(int speed,String nr,int litri){
	 super(speed,nr,litri);
	 this.fuel="diesel";
	 
 }

public void viewTheMaxSpeed() {
	
}
public void showDetail(){
	System.out.print("Fuel: "+this.fuel);
	System.out.print("  Litri: "+this.litri);
	System.out.print("  Number of registration: "+this.numberOfRegistration);
	System.out.print("  MaxSpeed "+this.speedMax);

}
 
}
