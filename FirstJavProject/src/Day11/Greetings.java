package Day11;

public class Greetings {
	
	int Sid;
	String name,address;
	char grade;
	
	
	void std()
	{
		System.out.println(Sid+": "+name+" "+address+" exam result is "+grade);
		
	}
	
	void SetStudentDate(int id,String nm,String add,char mrk)
	{
		Sid=id;
		name=nm;
		address=add;
		grade=mrk;
		
	}
	Greetings (int id,String nm,String add,char mrk)
	{
		Sid=id;
		name=nm;
		address=add;
		grade=mrk;
		
	}
	
	
	// 01. No return No param
	
	void m1()
	{
		System.out.println("Hello...");
	}
	
	
	// 02. No param and return value 
	
	String m2()
	{
		return("Hello how are you...");
	}
	
	
	// 03. take paran and no return 
	
	void m3 (int number)
	{
		System.out.println(number);
		
	}
	
	void m4 (String name,int number)
	{
		System.out.println(name+" "+ number);
		
	}
	
	
	String m4 (String name)
	{
		return("hello "+name);
	}
	
	
	
	

}
