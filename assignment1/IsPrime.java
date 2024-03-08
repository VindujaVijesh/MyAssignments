package week1.assignment1;

public class IsPrime {

	public static void main(String[] args) {

		int n = 23;
		int count = 0;
	
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println("The number " +n + " is prime. ");		
		}
		else {
			System.out.println("The number " +n + " is not prime. ");
		}
	}
}
