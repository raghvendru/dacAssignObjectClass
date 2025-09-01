package InheritanceIndepthsuperthis;
class A{
	int i = 10;
	
	public A() {
		this.i = 1;
	}
	
//	public A(int i){
//		this.i = i;
//	}
	
	public void Adis() {
		System.out.println(i  + "in super class");
	}
}
class B extends A{
	int j = 20;
	
	public B() {
		this.j = 2;
	}
	public B(int i,int j) {
		//super();
		this.i = 128;
		this.j = 200;
	}
	public void Bdis() {
		System.out.println(j + "in sub class");
	}
	
}
public class withConstructor {
	public static void main(String[] args) {
		B b = new B(200,300);
		b.Adis();
		b.Bdis();
	}

}
