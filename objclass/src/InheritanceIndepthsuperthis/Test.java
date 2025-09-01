package InheritanceIndepthsuperthis;

 class A1 
{    int i;


    A1()
    { i =5;
    	System.out.println("A no org cons" +i);
    }
    
	A1(int i)
	{
		this();
		this.i = i;
	}
	
	void dispA()
	{
		System.out.println(i);
	}
}

class B1 extends A1
{
	
	int j;;

	B1()
	{
		System.out.println("no arg B");
	}
	B1(int i,int j)
	
	{    
		this();
		
		this.j = 25;
	}
	
	void dispB()
	{
		System.out.println(j);
	}
		
}

class Test
{
	public static void main(String[] args) {
		
		B1 b = new B1(10,20);
		b.dispA();
		b.dispB();
		
	
	}
}
