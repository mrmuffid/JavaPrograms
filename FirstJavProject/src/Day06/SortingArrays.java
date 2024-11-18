package Day06;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,200,500,700,200,400,300,400,900,100};
		String arrayString0= Arrays.toString(a);
		System.out.println(arrayString0);
		
	
		Arrays.sort(a);
		String arrayString= Arrays.toString(a);
		
		
		
		
		System.out.println("aftre sorting on accending order : "+arrayString);
		
		 //Arrays.sort(a, Collections.reverseOrder());
		

	}

}
