import java.util.Scanner;
public class ConverterCtoF
{
	public static void main(String[] args)
	{
		double input;
		double output;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temprature to convert: ");
		input = in.nextDouble();
		//in.nextline();
		output = input * (9.0/5.0) + 32;
		System.out.printf("This is %.1fF", output);
	}
}