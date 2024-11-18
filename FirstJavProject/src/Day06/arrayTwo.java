package Day06;

public class arrayTwo {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,400,500,400,400,400};
		int SE = 400;
		boolean status=false;
		int Element_count= 0;
		
		
//		for(int x = 0;x<a.length;x++)
//		{
//			if(SE==a[x])
//			{
//				System.out.println("Element found");
//				status=true;
//				break;
//			}
//		}
		
		for (int y:a)
		{
			if(SE==y)
			{
			    status=true;
			    Element_count++;
			    
	
			}
				
			
		}
		
//		if(status==false)
//		{
//			System.out.println("Element not found");
//		}
		
		String tr = Element_count>0 ? "Element found":"Eement not found";
		System.out.println(tr);
		
		if(Element_count>0)
		{
			System.out.println("Element count is : "+Element_count);
		}
		
		
		
		
 
	}

}
