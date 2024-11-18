package Day05;

public class forLoop {

	public static void main(String[] args) {
		
		for (int u=0;u!=10;u++)
		{
			System.out.println(u);
		}
		
		for(int y=1;y<=20;y++)
		{
			String out= y%2==0 ? "This is a even:"+y:"This is a odd:"+y;
			System.out.println(out);
		}
		
		
		for(int hyd = 0;hyd!=20;hyd+=2)
		{
			
			if(hyd==10)
			{
				break;
			}
			System.out.println(hyd);
		}
		
		System.out.println("muffid");
		
		for(int hd = 0;hd<=10;hd++)
		{
			
			if(hd==2 || hd==5 || hd==9)
			{
				continue;
			}
			System.out.println(hd);
		}
		
	
 
	}

}
