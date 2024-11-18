package Day13;

public class OverloadMain {
	
	int s;
	int x;
	
	
	void main()
	{
		int y = s+x;
		System.out.println(y);

	}
	void main(String v)
	{
		System.out.println(v);
	}
	
	void main (String d ,String e)
	{
		System.out.println(d.concat(e));
	}
	
	

	public static void main(String[] args) {
		OverloadMain ol= new OverloadMain();
		
		ol.s =10;
		ol.x=20;
		
		ol.main();
		ol.main("muffid");
		ol.main("muhammad ","muffid");
		
		
		
		
		
	}

}
