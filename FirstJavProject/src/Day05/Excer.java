package Day05;

public class Excer {

	public static void main(String[] args) {
		StringBuilder srk = new StringBuilder();
		int x = 123458;
		int xNew = x;
		int odd=0,even=0,count=0,sumAll=0;
		while (x>0)
		{
			int ur= x%10;
			int od=(x%2==0)? even++:odd++;
			sumAll+=ur;
			System.out.print(ur);
			x/=10;
			srk.append(ur);
			count++;
			
		}
		
		int number = Integer.parseInt(srk.toString());
		String yu =(number==xNew)?"Print True":"Print False";
		System.out.println();
		System.out.println(yu);
		System.out.println("The count is:"+count);
		System.out.println("The odd count is:"+odd);
		System.out.println("The even count is:"+even);
		System.out.println("the Sum amount:"+sumAll);
		
		
		//----------------------------------------------------------------
		
		String a ="a";
		String A ="A";
		if(a==A)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
	
		
		

	}  

}

		

