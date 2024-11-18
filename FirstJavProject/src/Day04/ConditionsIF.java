package Day04;

public class ConditionsIF {
	public static void main (String[] args) {
		
		int age =20;
		if(age>= 18) {
			System.out.println("Report your vote");
		}
		else {
			System.out.println("Age is not enough");
		}
		
//		if(age<= 15)
//			System.out.println("hello");
//		else
//			System.out.println("Bye");
		
		
		if(age%2 == 0) {
			
			System.out.println("age is a Even");
			
		}else {
			System.out.println("Age is a Odd");
		}
		
		int x = -10;
		if (x>0) {
			System.out.println("number is a positive number");
		
		}else if(0>x) {
			System.out.println("The numebr is a nergative number");
		}else {
			System.out.println("Number is a 0");
		}
		if (x>0) {
			System.out.println("number is a positive number");
		
		}
		
		String bf = x==0 ? "Zero": "negative";
		System.out.println(bf);
		
		
		
		
		int vc=112, gb=504, jg=850;
		
		if (vc>gb) {
			if(vc>jg) {
				System.out.println("Max"+" "+vc);
			}
		}else if (gb>jg) {
			System.out.println("Max"+" "+gb);
			
		}else {
			System.out.println("Max"+" "+jg);
		}
		System.out.println("muffid");
		if (vc>gb) {
			if(vc>jg) {
				System.out.println("Max"+" "+vc);
			}
		}else {
			String gt = (gb>jg) ? "Max is"+" "+gb : "Max is"+" "+jg;
			System.out.println(gt);
			
		}
		
		
		
		System.out.println("mufffid");
		if (vc>gb && vc>jg) {
			System.out.println("max number is:"+" "+vc);
		} else if (gb > jg) {
			System.out.println("max number is :"+ " "+gb);
			
		}else {
			System.out.println("max number is :"+ " "+jg);
		}
		
	
		
		
		
	}

}
 