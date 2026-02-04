//Ryan Rodriguez 
/*2/3/26
//CSC321 
//Lab #4
*/
import java.util.Scanner;
public class rrodriguez4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Menu: Inspirational Quotes/Saying ");
		System.out.println("1. Quote 1");
		System.out.println("2. Quote 2");
		System.out.println("3. Quote 3");
		System.out.println("4. Quote 4");
		System.out.print("Enter a Choice: ");
		int userChoice = input.nextInt();

		if(userChoice == 1)
		{
			System.out.println("Goals Transform a random walk into a chase. ");
		}
		else if(userChoice == 2)
		{
			 System.out.println("Everything happens for a reason.");
		}
		else if(userChoice == 3)
		{
			 System.out.println("Diamonds are made under pressure. ");
		}
		else if(userChoice ==4)
		{
			 System.out.println("And still I rise.");
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}
