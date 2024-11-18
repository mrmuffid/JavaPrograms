package Day05;

public class Loop {
	public static void main(String[] args) {
		int i = 5;
		while(i<=10) {
			System.out.println(i);
			i++;
			i=i+1;
		}
		
		i = 1;
		int x=10;
		while (x!=0) {
			System.out.println(i+":Helllo");
			x--;
			i++;
		}
  		
		
		
		int number = 1;
		while (number!=20) 
		{
			if(number%2==0)
			{
				System.out.println("This is a even number:"+number);
			} 
			else
			{
				System.out.println("This is a Odd number:"+number);
			}
			number++;
		}
		
		
		int ho = 10;
		do
		{
			System.out.println(ho);
			ho--;
		}
		while(ho!=0);
		
	}

}
