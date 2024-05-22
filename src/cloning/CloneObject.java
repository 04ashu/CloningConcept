package cloning;

public class CloneObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1, "Rajesh");
		Employee e2 =  (Employee)e1.clone();
		
		System.out.println(e1==e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1);
		System.out.println(e2);
		e1.setId(2);
		e1.setName("Rohit");
		System.out.println(e1);
		System.out.println(e2);

	}

}
