package Main;
import Class.AutoVehicle;
import Class.Car;
import Class.Tractor;
import Class.Vehicle;
import Class.bicycle;
import exceptions.exceptions;
/**
 * @author rusu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 Vehicle v1=new bicycle("Bogdan");
	 v1.view();
	 v1.set_the_owner("tata");
	 v1.view();
	 try {
	 v1.start_engine();
	 }
	 catch (exceptions e){
		 System.out.println("\nException while starting engine: " + e.getMessage());
	 }
	 try{
	 v1.get_fuel(40);
	 }
	 catch(exceptions e5)
	 {
		 System.out.println("\nException while fuel " + e5.getMessage());
	 }
	 AutoVehicle t1=new Tractor(50,"GL-56-TRR",10);
	 try{
	 t1.start_engine();
	 }
	 catch (exceptions e1){
		 System.out.println("\nException while starting engine: " + e1.getMessage());
	 }
	 t1.show_detail();
	 AutoVehicle a1=new Car(130,"GL-45-MMM",0);
	 try{
		 
	 a1.start_engine();
	 }
	 catch(exceptions e2){
		 System.out.println("\nException while starting engine: " + e2.getMessage());
	 }
	 a1.show_detail();
	 try{
	 a1.get_fuel(30);
	}
	 catch (exceptions e1){
		 System.out.println("\nException while starting engine: " + e1.getMessage());
	 }
	 try{
		 
	 a1.start_engine();
	 }
	 catch(exceptions e3){
		 System.out.println("\nException while starting engine: " + e3.getMessage());
	 }
	}
}
