package Interface;
import exceptions.exceptions;
public interface Drive {
		public boolean has_gasoline() throws exceptions;
		public boolean has_diesel() throws exceptions;
		public void start_engine() throws exceptions;
		public void get_fuel(int nr) throws exceptions;
}
