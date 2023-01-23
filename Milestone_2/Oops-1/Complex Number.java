/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	int realPart;
	int imaginaryPart;
	
	public ComplexNumbers( int realPart, int imaginaryPart) {
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	
	public void setrealPart(int realPart) {
		this.realPart=realPart;
	}
	
	public void setimaginaryPart(int imaginaryPart) {
		this.imaginaryPart=imaginaryPart;
	}
	
	public void plus(ComplexNumbers c2) {
		this.realPart=this.realPart+c2.realPart;
		this.imaginaryPart=this.imaginaryPart+c2.imaginaryPart;
	}
	public void multiply(ComplexNumbers c2) {
		int realPart=(this.realPart*c2.realPart-this.imaginaryPart*c2.imaginaryPart);
		int imaginaryPart=(this.imaginaryPart*c2.realPart+this.realPart*c2.imaginaryPart);
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
		
	}
	public void print() {
		System.out.println(realPart+ " + i"+imaginaryPart);
	}

	
}
