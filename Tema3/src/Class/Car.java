package Class;
import Class.AutoVehicle;

public class Car extends AutoVehicle {

	public Car(int speed,String nr,int litri){
		super(speed,nr,litri);
		this.fuel="gasoline";
		 
	 }

	public void View_the_spee_dmax() {
		
	}
	public void show_detail(){
		System.out.print("Fuel: "+this.fuel);
		System.out.print("  Litri: "+this.litri);
		System.out.print("  Number of registration: "+this.Number_of_registration);
		System.out.print("  MaxSpeed "+this.Speedmax);

	}
	
}
