package Day08;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = "hello how are you";
		int l = x.length();
		
		System.out.println(l);
		System.out.println("hello muffid".length());
		
		String s1 ="    welcom ";
		String s2 = "to java";
		String s3 =" program";
		String s4 ="abcDEF";
		String s5 ="Hello";
		String  s6 ="Hello";
		
		
		// concat
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(" muffid"));
		
		
		//trim
		
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		
		//charAt
		System.out.println(s4.charAt(2));
		System.out.println(s4.charAt(0));
		
		
		
		System.out.println(s4.contains("abc"));
		System.out.println(s4.contains("Abc"));
		
		// equals     equalsignoreCase()
		System.out.println("muffid");
		System.out.println(s5==s6);
		System.out.println(s5.equals("Hello"));
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals("HELLO"));
		
		
		System.out.println(s5.equalsIgnoreCase("HELLO"));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//replace   
		
		String br = "uuuuas";
		System.out.println(br.replace('u','a'));
		System.out.println(br.replace("uuuu","muffid"));
		
		
		
		//substring 
		System.out.println("Substring");
		s6="hello how are you";
		s1="hello";
		System.out.println(s6.substring(2,5));
		System.out.println(s6.substring(0,5));
		
		System.out.println(s1.replace('e', 'm').replace('l', 'z'));
		
		
		//toUpperCase  toLowerCase
		
		s1="hello";
		s2 ="LOWWER";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		
		//split()
		
		s1="hello@gmail.com";
		
		String a[]= s1.split("@");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(Arrays.toString(a));
		
		s2 ="$52,85,74";
		System.out.println(s2.replace("$","").replace(",",""));
		
		
		String ar1[]=s1.split("@");
		System.out.println(Arrays.toString(ar1));
		
		String ar2[]=ar1[1].split("\\.");
		System.out.println(Arrays.toString(ar2));
		
		s1="JOhn halo";
		
		System.out.println(s1.toLowerCase().contains("john"));
		
		
		
		
		
		
		
		
	

	}

}
 