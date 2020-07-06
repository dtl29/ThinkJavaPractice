public class Date
{
	public static void main(String[] args)
	{
	    String day = "Sunday";
	    int date = 5;
	    int year = 2020;
	    String month = "July"; 
	    System.out.println("American Format:");
	    System.out.print(day);
	    System.out.print(", ");
	    System.out.print(month);
	    System.out.print(", ");
	    System.out.print(date);
	    System.out.print(", ");
	    System.out.println(year);
	    
	    System.out.println("European Format:");
	    System.out.println(day + ", " + date + ", " + month + ", " + year);
	}
}
