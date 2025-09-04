package Assignment5abstrctionInterface;
//Smart Home Devices
//•	Create an interface SmartDevice with methods turnOn(), turnOff(), and getStatus().
//•	Implement this in Light and Fan classes, each having instance variables like deviceId and status.
//•	Add constructors in subclasses to initialize device details.
//•	Write a test class to create objects of Light and Fan, then simulate switching them on and off.
interface SmartDevice{
    void turnOn();
	void turnOff();
	void getStatus();
}
class Light implements SmartDevice{
	int dId;
	boolean status;
	public Light(int i,boolean s) {
		this.dId = i;
		this.status = s;
	}
	
	public void turnOn() {
		status = true;
		System.out.println("your light is : turned On");
	}
	public void turnOff() {
		status = false;
		System.out.println("your light is : turned Off");
	}
	public void getStatus() {
		System.out.println("Status of the device is: "+status);
	}
}
class Fan implements SmartDevice{
	int dId;
	boolean status;
	public Fan(int i,boolean s) {
		this.dId = i;
		this.status = s;
	}
	
	public void turnOn() {
		status = true;
		System.out.println("your light is : turned On");
	}
	public void turnOff() {
		status = false;
		System.out.println("your light is : turned Off");
	}
	public void getStatus() {
		System.out.println("Status of the device is: "+status);
	}
}
public class SmartHomeDevices {
public static void main(String[] args) {
	SmartDevice s;
	s = new Light(123,false);
	s.turnOn();
	s.getStatus();
	s = new Fan(123,true);
	s.turnOff();
	s.getStatus();
}
}
