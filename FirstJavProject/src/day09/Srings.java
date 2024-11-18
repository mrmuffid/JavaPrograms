package day09;

public class Srings {

	public static void main(String[] args) {
		String u = "Welcome";
		String reverce ="";
		for(int i = u.length()-1;i>=0;i--)
		{
			reverce+=u.charAt(i);
			
			
		}
		System.out.println(reverce);
		
		
		//StringBuffer    Stringbuilder 
		
		StringBuffer s=new StringBuffer("Heello welcome");
		
		System.out.println(s.reverse());
		
		
		StringBuilder wr=new StringBuilder("muffid");
		System.out.println(wr.reverse());
		
		
		
		
		
		String w1 = "Madam00";
		
		String w2 = w1.toLowerCase();
		String w3 ="";
		
		System.out.println(w2);
		
		
		for (int o = w2.length()-1; o>=0;o--)
		{
			
			w3+=w2.charAt(o);
			
		}
		System.out.println("reverce  "+w3);
		
		
		
		if ( w2.equals(w3))
		{
			System.out.println("input and out put same ");
		}
		else
		{
			System.out.println("input and out put is does not same");
		}
		
		
		String op = "hello how are you gtrh ghtr gr5h rhg ht rh";
		char w =' ';
		String wt = "";
		
		for (int t = 0;op.length()>t;t++)
		{
			if (w!=op.charAt(t))
			{
				wt+=op.charAt(t);
			}
		}
		
		System.out.println(wt);
		
		
		int count = 161+106166;
		for ( int t = 0; op.length()>t;t++)			
		{
			if (w==op.charAt(t))
			{
				count++;
				
			}
			
		}  
		System.out.println("full word count is "+count);
		
		
		
		

		
		
	}

}
