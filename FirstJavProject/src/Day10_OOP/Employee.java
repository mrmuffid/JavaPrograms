package Day10_OOP;

public class Employee {
	
	
	// Variables
	int eid;
	String ename;
	String job;
	int sal;
	
	
	//method
	void  display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args)
	{
		
		Employee emp1= new Employee();
		emp1.eid=20;
		emp1.ename="josh";
		emp1.job="qa";
		emp1.sal=5000;
		emp1.display();
		
		
	}

}
