package Day13;

public class ConstractorOverloading {
	
	Double width, height, depth;
	
	
	ConstractorOverloading()
	{
		width=height= depth = 2.0;
	
	}
	ConstractorOverloading(double x,double y, double z)
	{
		
		width= x;
		height= y;
		depth = z;
	
	}
	
	ConstractorOverloading(double c)
	{
		
		width=height= depth = c;
		
	}
	
	double volume ()
	{
		return (width*height*depth);
	}
	
	
	public static void main (String[] args)
	{
		ConstractorOverloading co = new ConstractorOverloading(5.0,6.0,5.0);
		
		double h =co.volume();
		
		System.out.println(h);
		
		
	}
	
	
	
	
	

}
