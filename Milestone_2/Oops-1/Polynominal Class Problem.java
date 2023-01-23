
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


class DynamicArray {

    int[] array;

    public DynamicArray() {
        this.array = new int[1];
    }

    public int getSize() {
        return array.length;
    }

    public void growSize() {
        int[] temp = new int[array.length * 2];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public int get(int index) {
        if (index >= array.length) return 0;
        return array[index];
    }

    public void addAt(int index, int data) {
        while (index >= array.length) {
            growSize();
        }
        array[index] += data;
    }

    public void set(int index, int data) {
        while (index >= array.length) {
            growSize();
        }
        array[index] = data;
    }
}


public class Polynomial {

    DynamicArray array = new DynamicArray();

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coefficient) {
        array.set(degree, coefficient);
    }

    public void addCoefficient(int degree, int coefficient) {
        array.addAt(degree, coefficient);
    }



    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i=0;i<array.getSize();i++){
            if (array.get(i)!=0){
                System.out.print(array.get(i)+"x"+i+" ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        for (int i=0;i<Math.max(this.array.getSize(),p.array.getSize());i++){
            array.addAt(i,p.array.get(i));
        }
        return this;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        for (int i=0;i<Math.max(this.array.getSize(),p.array.getSize());i++){
            array.set(i,array.get(i)-p.array.get(i));
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial poly = new Polynomial();
        for (int i=0;i<this.array.getSize();i++){
            for (int j=0;j<p.array.getSize();j++){
                poly.addCoefficient(i+j,this.array.get(i)*p.array.get(j));
            }
        }
        return poly;
    }
}