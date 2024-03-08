package week1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int x=0;
		int y =1;
		int sum = 0;
		int range = 8;
		System.out.println("The firt number is " +x + " and "+ "the second number is "+ y);
		for(int i = 0;i < range;i++) {
			sum=x+y;
			System.out.println("The Fibonacci Series: " +sum);
			x=y;
			y=sum;
		}
	}

}

