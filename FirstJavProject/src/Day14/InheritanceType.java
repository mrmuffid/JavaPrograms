package Day14;

class A 
{
	int a = 10;
	void display ()
	{
		System.out.println(100+a);
	}
}


class B extends A
{
	int b =20 ;
	void show()
	{
		System.out.println(11+b);
	}
}

class C extends B
{
	int d;
	void classC ()
	{
		System.out.println(d);
	}

}


public class InheritanceType {
	public static void main(String[] args)
	{
		
		A oba = new A();
		
		System.out.println(oba.a);
		oba.display();
		
		System.out.println("muffid");
		B obb = new B();
		
		System.out.println(obb.a);
		System.out.println(obb.b);
		
		obb.show();
		obb.display();
		
		System.out.println(" multilevel ");
		
		
		C obc = new C();
		
		obc.d=5;
		obc.classC();
		
		obc.a=2;
		obc.display();
		obc.show();
		obc.classC();
		
		
		
		
		
		
				
		
	
		
		
		
		
	}
	
	
	
	

}
