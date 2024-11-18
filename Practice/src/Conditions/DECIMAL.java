package Conditions;

public class DECIMAL {
	public static void main(String[] args)
	{
		float x =85.5f;
		int y = 78;
		int c = 50;
		
		
		System.out.println(2.5/10.0);
		
		if(100>x && x>=10)
		{
			System.out.println("yes");
			
			 
		}
		else
		{
			System.out.println("This is not a 2 desimal number");
		}
		
		
		
		/////////////////
		
		int u = 52525;
		int v = 52525;
		int r = 52525;
		
		if (u<v&&v<r)
		{
			System.out.println("increasing");
		}
		else
		{
			String out = (u>v && v>r)? "Decreasing":"invalid";
			System.out.println(out);
		}
		
		if(u==v&&v==r)
		{
			System.out.println("Smae");
		}else
		{
			String outa = (u!=v && v!=r)? "Deferent":"invaa";
			System.out.println(outa);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
