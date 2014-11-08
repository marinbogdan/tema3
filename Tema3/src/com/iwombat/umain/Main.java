package com.iwombat.umain;
import com.iwombat.exceptions.Exceptions;
import com.iwombat.uclass.AutoVehicle;
import com.iwombat.uclass.Car;
import com.iwombat.uclass.Tractor;
import com.iwombat.uclass.Vehicle;
import com.iwombat.uclass.Bicycle;

/**
 * @author rusu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 Vehicle vBicyle=new Bicycle("Bogdan");
	 vBicyle.view();
	 vBicyle.setTheOwner("tata");
	 vBicyle.view();
	 try {
	 vBicyle.startEngine();
	 }
	 catch (Exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	 try{
	 vBicyle.getFuel(40);
	 }
	 catch(Exceptions e)
	 {
		 System.out.println("\nException while fuel " + e.getMessage());
	 }
	 AutoVehicle tRactor=new Tractor(50,"GL-56-TRR",10);
	 try{
	 tRactor.startEngine();
	 }
	 catch (Exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	 tRactor.showDetail();
	 AutoVehicle aCar=new Car(130,"GL-45-MMM",0);
	 try{
		 
	 aCar.startEngine();
	 }
	 catch(Exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	 aCar.showDetail();
	 try{
	 aCar.getFuel(30);
	}
	 catch (Exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	 try{
		 
	 aCar.startEngine();
	 }
	 catch(Exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	}
}
