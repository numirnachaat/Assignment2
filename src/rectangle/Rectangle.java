package rectangle;

public class Rectangle {

	
	private double lenght;
	private double width;
	
	public Rectangle (double length, double width) {
		this.lenght=length;
		this.width = width;
	}
	
	public double getLength() {
		return this.lenght;	
	}
	public void setLength(double length) {
		this.lenght=length;
	}
	public double getWidth() {
		return this.width;	
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public static double calculateArea(double length, double width) {
		double area = length*width;
		return area;
	}
	public static double calculatePerimeter(double length, double width) {
		double perimeter = 2*length+2*width;
		return perimeter;
	}
}
