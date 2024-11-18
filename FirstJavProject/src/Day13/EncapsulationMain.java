package Day13;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		
//		enc.age=10;
//		enc.name="muffid";
//		enc.salary=1000.00;
		
		
		enc.setAge(10);
		enc.setName("Muffid");
		enc.setSalary(5000.00);
		
		System.out.println(enc.getAge());
		
		String ad = enc.getName();
		System.out.println(ad);
		
		System.out.println(enc.getSalary());
		
	
		
		






	}

}
