package Conditions;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
	
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		int x = 1;
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(x);
				x++;
			}
			System.out.println();
			
		}
		
		
//		int o = 5;
//		int u =1;
//		for (int i=1;i<=5;i++)
//		{
//			for (int c=o;c>1;c--)
//			{
//				System.out.print(" ");
//			}
//			for (int j=1;j<=u;j++)
//			{
//				
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			o--;
//			u+=2;
//			
//			
//		}
		
		int yt = 1;
		
		for (int xc = 1;xc<=10;xc++)
		{
			for (int vb = 10; vb>xc;vb--)
			{
				System.out.print(" ");
			}
			for (int uc = 1; uc<=yt;uc++ )
			{
				System.out.print("*");
			}
			System.out.println();
			yt+=2;
			
		
		}
		
		for (int xt = 1;xt<=10;xt++)
		{
			for (int vg = 1; vg<=xt;vg++)
			{
				System.out.print(" ");
			}
			for (int ud = 1; ud<=(yt-4);ud++ )
			{
				System.out.print("*");
			}
			System.out.println();
			yt-=2;
		}
		
		
	
		
		
		
		
		
		
		
	}

}
