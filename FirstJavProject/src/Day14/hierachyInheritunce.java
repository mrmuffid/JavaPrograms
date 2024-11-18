package Day14;


class Ac
{
	int a = 10;
	void classA()
	{
		System.out.println(a);
	}
}


class Bc extends Ac
{
	int b = 20;
	void classB()
	{
		System.out.println(b);
		
	}
}

class Cc extends Ac
{
	int c =30;
	void classC()
	{
		System.out.println(c);
	}
}



public class hierachyInheritunce {
	
	public static void main (String[] args)
	{
		Cc obbc = new Cc();
		
		obbc.classA();
		obbc.classC();
		
		
		
	}
	
	
	

}
