package Extras;
class A{
	int i;
	A(){
		i = 11;
		System.out.println("its noargs");
	}
	A(int i){
		this.i = 10;
	}
	void Adis() {
		System.out.println(i);
	}
}
class B extends A{
	int j;
	B(int j,int i){
		//super(i);
		this.j = j;
	}
	void disp() {
		System.out.println(j);
	}
}
public class ConstrBehaa {
public static void main(String[] args) {
	B b = new B(25,1);
	b.disp();
	b.Adis();
}
}
