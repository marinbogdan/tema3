package Class;
import Class.Vehicle;
import exceptions.exceptions;

public class bicycle extends Vehicle {
	
	public void get_fuel(int nr) throws exceptions
	{
		if (this.has_diesel()==false)
			throw new exceptions("You can't put fuel");
	}
	public bicycle(String name) {
		super(name);
	}
	public void set_the_owner(String name)
	{
		this.owner=name;
	}
	public void view()
	{
		System.out.println(" Owned by : "+this.owner);
	}

}
