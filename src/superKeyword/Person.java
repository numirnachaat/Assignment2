package superKeyword;

 class Person {

	 void message() {
		System.out.println("This is person class\n");
	}
}
class Student extends Person{
	 void message() {
		System.out.println("This is studentr class");
	}
	 void display() {
		message();
		super.message();
	}
}
class Test{
	public static void main(String []args) {
		Student s = new Student();
		s.display();
	}
}