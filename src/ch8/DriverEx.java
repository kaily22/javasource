package ch8;

public class DriverEx extends Bus {

	public static void main(String[] args) {
	Driver driver = new Driver();
	//driver(Vehicle vehicle)
	driver.drive(new Vehicle());
	driver.drive(new Bus());
	driver.drive(new Taxi());
	}
}
