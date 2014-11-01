package Class;
import Interface.Drive;
import exceptions.exceptions;
public abstract class Vehicle implements Drive {
	String owner;
	public Vehicle(String name)
	{
		this.owner=name;
	}
	public abstract void set_the_owner(String name);
	public abstract void view();
	public boolean has_gasoline() //throws exceptions
	{
		return false;
		//throw new exceptions("The name of the student is invalid");
	}
	public boolean has_diesel() //throws exceptions
	{
		return false;
	}
	public void start_engine() throws exceptions
	{
		if (has_gasoline()==false)
			throw new exceptions("Do not have engine");
		else
			System.out.println("Engine start!!");
	}
}
