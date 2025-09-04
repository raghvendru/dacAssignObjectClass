package Extras;
abstract class Bank11{
	String name;
	public Bank11(String n) {
		this.name = n;
	}
	
	public void dis() {
		System.out.println(name);
	}
	
	public abstract void calIntrest();
	
	
}

class A1 extends Bank11{
	public A1(String n) {
		super(n);
	}
	public void calIntrest() {
		System.out.println("0.07");
	}
	
}
public class TestAbstract {
public static void main(String[] args) {
	A1 a = new A1("rr");
	a.dis();
	a.calIntrest();
}
}
