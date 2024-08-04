package weekfour;

public class Rectangle {

	double length, breadth;

	// constructor 1
	Rectangle() {
		length = 0;
		breadth = 0;
	}

	// constructor 2
	Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	// constructor 3
	Rectangle(double l) {
		length = l;
		breadth = l;
	}

	double area() {
		return length * breadth;
	}

	public static void main(String[] args) {

		// create objects
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(20, 30);
		Rectangle rect3 = new Rectangle(10);
		
		// print areas
		System.out.println("Area of Rectangle 1 = " + rect1.area());
		System.out.println("Area of Rectangle 2 = " + rect2.area());
		System.out.println("Area of Rectangle 3 = " + rect3.area());
	}
}