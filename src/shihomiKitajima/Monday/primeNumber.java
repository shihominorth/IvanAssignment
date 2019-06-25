package shihomiKitajima.Monday;
import java.util.Scanner;  // Import the Scanner class 
public class primeNumber {
	public static void main(String[] args) {
		Scanner mynum = new Scanner(System.in);
		System.out.println("I gonna show you all of prime number within the range you input.");
		System.out.print("imform the maximum number: ");
		int max = mynum.nextInt();
		for (int x = max; x > 0; x--) {
			if (yesPrime(x)) {
				System.out.print( "   " + x);
			}
		}
}
	public static boolean yesPrime(int n) {
		if ( n <= 1 ) {
			return false;
		}
		for ( int i = 2; i <= n / 2; i++) {
			if ( n % i == 0) {
				return false;
			}
		}
		return true;
		
	}
}