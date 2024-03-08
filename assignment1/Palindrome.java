package week1.assignment1;

public class Palindrome {

	public static void main(String[] args) {

		int num=12321;
		int originalNumber = num;
		int rem,rev=0;
		while(num!=0)
		{
			rem=num % 10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(originalNumber==rev) {
			System.out.println(originalNumber+ " is palindrome.");
		}
		else
		{
			System.out.println(originalNumber+ " is not palindrome.");
		}
	}
}
