import java.util.Scanner; 

public class Main {

	public static int userNum = 0;

	public static void main(String[] args) {
		
		double thenumber = (double) Math.floor((Math.random() * 100 ) + 1);
		
		System.out.println("pick a number and keep it secret");
		pauseAMoment();
		System.out.println("double it");
		pauseAMoment();
		System.out.println("add " + thenumber);
		pauseAMoment();
		System.out.println("divide by 2");
		pauseAMoment();
		System.out.println("substract from the current number your first number");
		pauseAMoment();
		System.out.println("the number is " + (thenumber/2));
		
		

	}

	

	public static void pauseAMoment() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Press emnter when ready");
		keyboard.nextInt();
		
	}
}
	

