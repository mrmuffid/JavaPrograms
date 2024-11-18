package Day13;

public class StaticDemo {
	
	static int x=10;
	
	int y = 20;
	
	void m1()
	{
		System.out.println("Hello this is a non statuic method");
		
		
	}
	
	static void m2()
	{
		System.out.println("Hello this a Static method");
	}
	
	void m5 ()
	{
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
	}
	
	

	public static void main(String[] args) {
		
		StaticDemo sd = new StaticDemo();
		
		sd.m1();
		
		m2();
		
		System.out.println(x);
		
		System.out.println(sd.y); 
		
		sd.m5();
		
		
		
		
		
		

	}

}
