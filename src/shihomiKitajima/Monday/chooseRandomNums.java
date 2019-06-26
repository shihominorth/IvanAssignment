package shihomiKitajima.Monday;
import java.util.Scanner;  // Import the Scanner class
public class chooseRandomNums 
	{
	
	// this method returns a value that represents how many
	// numbers we could possibly have between min and max
	public static int rangeOfNumbers(int min, int max)
		{
		return max - min - 1;
		}
	
	
	// here i declare some variables glpbally that will be useful
	
	// gets keyboard input
	static Scanner keyboardInput;
	
	// store our min and max range
	static int maxNumber;
	static int minNumber;
	
	// how many numbers we sh0ould generate?
	static int numberOfRandomNumbers;
	
	// where we put the numbers we do denerate 
	static int[] listOfNumbers;
	
	
	
	// gets a random number between min and Max
	public static int GetRandomNumber(int min, int max)
		{
		return (int) (min + Math.random() * (max - min));
		}
	
	// gets data from the user and stores in globa varibles
	public static void GetDataFromUser()
		{
		System.out.print("provide me max num: ");
		 maxNumber = keyboardInput.nextInt();
		 
		System.out.print("provide me min num: ");
		 minNumber = keyboardInput.nextInt();
		 
		System.out.print("How many random numbers do you want to know?: ");
		numberOfRandomNumbers = keyboardInput.nextInt();
		
		listOfNumbers = new int[numberOfRandomNumbers];
	}
	
	// will check to see if the data the user entered is valid or not
	// if not, ask the user to enter data again, else, its all ok
	static boolean isDataValid()
		{
		
		return true;
		}
	
	// program starts here
	public static void main(String[] args) 
		{
		
		// make our keyboard object so we can get information from it
		keyboardInput = new Scanner(System.in);
		// ask the user for information
		GetDataFromUser();
		
		// now check if the information is within range
		
		if (rangeOfNumbers(minNumber,maxNumber) >= numberOfRandomNumbers) {
			GetDataFromUser();
			} else {
			// Now, we started to show the numbers we want to know.
			for ( int i = 0; i < numberOfRandomNumbers; i++) 
				{
				// choose a number at first in order to compare the list of numbers.
				int ANumber = (int) (minNumber + Math.random() * (maxNumber - minNumber));
				// show ANumber.
				System.out.println("genered random  number+ " + ANumber);
				// compare the previous chosen numbers to ANumber
				// Is there same chosen number as ANumber? 
				System.out.println("found　duplicate " + isDuplicate(listOfNumbers, listOfNumbers[i]));
				// if there is same chosen number as ANumber, get random number again.
				if (isDuplicate(listOfNumbers, ANumber)) 
					{
					listOfNumbers[i] = GetRandomNumber(minNumber, maxNumber);
					//System.out.println(n[i]);
					}  
				// if not, the number go inside listOfNumbers
				else 
					{
					listOfNumbers[i] = ANumber;
					}
				}
			}
			}
		
	// Here is the method that check if there is duplication.	
	public static boolean isDuplicate (int[] previous, int current) 
		{
		System.out.println("checking for duplicate+ "  + current);
		// check if the current number is same as previous numbers.
		for ( int i = 0; i < previous.length; i++) 
			{
			System.out.println("check in " + previous[i] + " against " + current );
			// if there is same number as current one, return true and show the message.
			if ( previous[i] == current) 
				{
				System.out.println("found duplicate");
				return true;
				}
			// if not, return false.
			}
		return false;
		}
	
	}


