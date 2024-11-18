package Day13;

public class polymorphism {
	
	int x=10,y=20;
	

	
	void sum()
	{
		System.out.println(x+y);
	}
	void sum(int x , int y)
	{
		System.out.println(x+y);
	}
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
	void sum(int x, int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	
	

	public static void main(String[] args) {
		polymorphism pl = new polymorphism();
		pl.sum(20,50);
		pl.sum();
		pl.sum(55,40.5);
		pl.sum(10.1,6);
		pl.sum(1,8,8);	}

}
