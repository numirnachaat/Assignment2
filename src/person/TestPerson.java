package person;

public class TestPerson {

	public static void main(String[]args) {
		
		Person p = new Person("John Doe", 30, "250 Main St.");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		
		p.setAddress("123 Elm St.");
		System.out.println();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		
	}
}
