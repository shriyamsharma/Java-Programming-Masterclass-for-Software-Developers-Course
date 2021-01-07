package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double first_val = 20.00d;
	    double second_val = 80.00d;
	    double res_val = first_val + second_val;
	    res_val *= 100d;
		System.out.println(res_val);
       	double remaider = (res_val % 40.00d);
		System.out.println(remaider);

		if(remaider == 0) {
			boolean boolres = true;
			System.out.println(boolres);
		}
		if(remaider != 0) {
			boolean boolres = false;
			System.out.println("Got some remainder");
		}

    }
}
