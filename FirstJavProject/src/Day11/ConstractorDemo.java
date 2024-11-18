package Day11;

public class ConstractorDemo {
	
	int x,y;
	
	
	ConstractorDemo()
	{
		x=10;
		y=20;
		
	}
	ConstractorDemo(int a,int b)
	{
		x=a;
		y=b;
		
	}
	
	void sum ()
	{
		System.out.println(x+y);
	}
	
	void print()
	{
		System.out.println(x+y);
	}
	
	
	
	
	
	public static void main ( String[] args)
	{
		ConstractorDemo CD = new ConstractorDemo();
		
		CD.sum();
		
		ConstractorDemo CD1 = new ConstractorDemo(52,14);
		
		CD1.sum();
		
		ConstractorDemo CD3 = new ConstractorDemo(); 
		
		CD3.x = 52;
		CD3.y = 1;
		
		CD3.print();
		
		
		
	}

}
