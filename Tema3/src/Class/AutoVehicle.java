package Class;

import Interface.Drive;
import exceptions.exceptions;

public abstract class AutoVehicle implements Drive {
	int Speedmax;
	String fuel;
	int litri;
	String Number_of_registration;
	abstract void View_the_spee_dmax();
	public abstract void show_detail();
	public void get_fuel(int nr) throws exceptions
	{
		this.litri=this.litri+nr;
		if(litri<0)
			throw new exceptions("Negative fuel");
	}
	public AutoVehicle(int speed,String nr,int litri)
	{
		this.Speedmax=speed;
		this.Number_of_registration=nr;
		this.litri=litri;
	}
	public boolean has_gasoline()
	{	
			if(litri==0)
				return false;
			else
				return true;	
	}
	public boolean has_diesel()
	{
		if(litri==0)
			return false;
		else
			return true;
	}
	public void start_engine() throws exceptions
	{
		if (has_gasoline()==false) 
				throw new exceptions("Do not have gas");
		else
			{
			System.out.println();
			System.out.println("Engine start!!");
			}
	}
}
