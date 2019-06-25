package shihomiKitajima.Monday;
import java.util.Scanner;  // Import the Scanner class
public class choose3nums {
	public static void main(String[] args) {
		Scanner mynum = new Scanner(System.in);
		System.out.print("provide me max num: ");
		int max = mynum.nextInt();
		System.out.print("provide me min num: ");
		int min = mynum.nextInt();
		// num1 is the maximum number computer choose.
		// if max is 65 and min is 63, 
		// (max - min) + 1 equals 3.
		// so without + min, computer will choose num between 1,2 and 3.
		// that's why I add min.
		int num1 =(int)(Math.random()*((max-min)+1)+min);
		System.out.println("Max number : " + num1);
		// num2 is the minimum number computer choose.
		int num2 = (int)(Math.random()*((num1 - min) +1) + min);
		System.out.println("Min number: " + num2);
		// num3 is the number between num1 and num2.
		int num3 = (int)( Math.random()* (num1 - num2 + 2)) + num2;
		System.out.println("the number between them: " + num3 );
	}
	
}
