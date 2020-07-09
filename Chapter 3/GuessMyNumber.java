import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber
{
	public static void main(String[] args)
	{
		int input;
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100 (inclusive)");
		System.out.println("Can you guess what it is?");
		System.out.print("Type a number: ");
		input = in.nextInt();
		System.out.println("Your guess is: " + input);
		System.out.println("The number I was thinging of is: " + number);
		System.out.println("your were off by: " + (number - input));
		
	}
}