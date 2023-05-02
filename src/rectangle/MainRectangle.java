package rectangle;

public class MainRectangle {

	public static void main(String[]args) {
		
		Rectangle r = new Rectangle(5, 10);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
	System.out.println();
		System.out.println(r.calculateArea(10, 5));
		System.out.println(r.calculatePerimeter(10, 5));
		r.setLength(20);
		System.out.println();
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println();
		r.setLength(20);
		System.out.println(r.calculateArea(20, 5));
		System.out.println(r.calculatePerimeter(20, 5));
	}
}
