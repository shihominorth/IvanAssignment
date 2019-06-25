package shihomiKitajima.Monday;
import java.util.Scanner;  // Import the Scanner class
public class choose3nums {
	public static void main(String[] args) {
		Scanner mynum = new Scanner(System.in);
		System.out.print("provide me max num: ");
		int max = mynum.nextInt();
		System.out.print("provide me min num: ");
		int min = mynum.nextInt();
		if ( max - min + 1 < 3) {
			System.out.println("Could you choose the numbers that have the differences is 3");
			// how do i ask users to put correct numbers again?
			System.out.println("press run button again.");
			// how can i show error when user input character
		}else if (max - min + 1 == 3){
			int num1 = max;
			System.out.println("Max number : " + num1);
			// num2 is the minimum number computer choose.
			int num2 = min;
			System.out.println("Min number: " + num2);
			// num3 is the number between num1 and num2.
			int num3 = max - 1;
			System.out.println("the number between them: " + num3 );
		} else {
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
			// why does the program show num3 is the same number as num2?
//			int num3 = (int)( Math.random()* (num1 - num2 + 2)) + num2;
			int temp = (int)( Math.random() * ( num1 - num2) + 1);
			int num4 = temp + num2;
			System.out.println("the number between them: " + num4 );
		}
	}
}
