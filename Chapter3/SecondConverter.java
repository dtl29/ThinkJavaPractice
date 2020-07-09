import java.util.Scanner;
//converts inputed seconds into hours minutes and seconds and outputs them to display 
public class SecondConverter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input, seconds, minutes, hours;
		System.out.print("Please enter seconds to convert: ");
		input = in.nextInt();
		minutes = input / 60; 
		seconds = input - minutes*60;
		hours = minutes / 60; 
		minutes = minutes - hours * 60;
		System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
	}
}