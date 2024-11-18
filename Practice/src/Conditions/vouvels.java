package Conditions;

public class vouvels {

	public static void main(String[] args) {
		String letter = "5";
		
		String lw = letter.toLowerCase();
		
		
		boolean isVowel = lw.equals("a") || lw.equals("e") || lw.equals("i") || lw.equals("o") || lw.equals("u");

		
		boolean uppercase = letter.charAt(0) >= 65 && letter.charAt(0) <= 90;
		boolean lowercase = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;
		
		

		
		if(letter.length()>1)
		{
			System.out.println("this is not a single charactor");
		} else 
		{
			if(uppercase || lowercase)
			{
				String casea =(uppercase)? "this is a uppercase":"this is a lowwer case";
				System.out.println(casea);
				
				
				String finals =(isVowel)? "this is a vowel":"this is not a vowel"; 
				System.out.println(finals);
				
				
				
			} else
			{
				System.out.println("this is not a string");
			}
			
			
			
		}
		

			
			
			
			
	}

}
