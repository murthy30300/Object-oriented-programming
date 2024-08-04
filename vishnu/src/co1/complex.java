package co1;

class Complex {
	  private double a;
	  private double b;

	  public Complex(double a, double b) {
	    this.a = a;
	    this.b = b;
	  }

	  public double getRealPart() {
	    return a;
	  }

	  public double getImaginaryPart() {
	    return b;
	  }

	  public String toString() {
	    return a + "+" + b + "i";
	  }

	  public Complex add(Complex x) {
	    double newRealPart = this.a + x.getRealPart();
	    double newImaginaryPart = this.b + x.getImaginaryPart();
	    return new Complex(newRealPart, newImaginaryPart);
	  }

	  public Complex sub(Complex x) {
	    double newRealPart = this.a - x.getRealPart();
	    double newImaginaryPart = this.b - x.getImaginaryPart();
	    return new Complex(newRealPart, newImaginaryPart);
	  }
	}

	public class ComplexDemo {
	  public static void main(String[] args) {
	    Complex c1 = new Complex(3, 4);
	    Complex c2 = new Complex(1, 2);

	    System.out.println("c1 = " + c1.toString());
	    System.out.println("c2 = " + c2.toString());

	    Complex c3 = c1.add(c2);
	    Complex c4 = c1.sub(c2);

	    System.out.println("c1 + c2 = " + c3.toString());
	    System.out.println("c1 - c2 = " + c4.toString());
	  }
	}