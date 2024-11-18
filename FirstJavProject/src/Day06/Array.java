package Day06;

public class Array {
	public static void main(String[] args)
	{
		
		int a[] = {100,200,300,400,500};
		
		System.out.println("length of an array:-"+a.length);
		
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
		
		for (int x = 0;x<a.length;x++)
		{
			
			System.out.println("value"+" " +a[x]);
			
			
		}
		
		for (int x = 1;x<=a.length;x++)
		{
			
			
			System.out.println("revers"+" "+a[a.length-x]);
			
		}
		
		
		int ad[][]= { 
				{100,200},
				{300,400},
				{500,600,700} 
		
		};
		
		System.out.println(ad.length);
		System.out.println(ad[0].length);
		
		System.out.println("Muffid");
		for (int h = 0 ; h<ad.length;h++)
		{
			for (int y=0; y<ad[h].length;y++)
			{
				System.out.print(ad[h][y]+ " ");
				
			}
			System.out.println();
				
		}
		
		
		for(int arr[]:ad)
		{
			for (int x:arr)
			{
				
				System.out.print(x+" ");
				
			}
			System.out.println();
		}
		
		
		Object f[]= {111,2.2,'a',"hello",true};
		
		for (int h = 0; h<f.length;h++)
		{
			System.out.print(f[h]+" ");
		}
		
		
		int sm[]= {5,6,8,9,2,5,2,5,3,5,45,89};
		int ng = 0;
		int even=0;
		int odd=0;
		int sumOfeven = 0;
		int sumOfodd = 0;
		
		int ux=0;
		
		while (ux<sm.length)
		{
			
			ng+=sm[ux];
			
			
			if(sm[ux]%2==0)
			{
				even++;
				sumOfeven+=sm[ux];
			}else
			{
				odd++;
				sumOfodd+=sm[ux];
			}
			ux++;
			
		}
//		for(int x=0;x<sm.length;x++)
//		{
//			ng+=sm[x];
//			int OE = sm[x]%2==0 ? even++:odd++;
//			//int OEd = sm[x]%2==0 ? sumOfeven+=sm[x]:sumOfodd+=sm[x];
//			
//		}
		System.out.println();
		System.out.println("sum of sm: "+ng);
		
		System.out.println("evenr="+even);
		System.out.println("odd="+odd);
		
		System.out.println("Sum of even is : ="+sumOfeven);
		System.out.println("Sum of odd is : ="+ sumOfodd);
		
		
		
		
	}

}
