public class Time
{
    public static void main(String[] args)
    {
        int hour = 21;
        int minute = 53; 
        int second = 33;
        
        minute += hour * 60;
        second += minute * 60;
        System.out.println("Seconds since midnight: " + second);
        System.out.println("Seconds remaining in the day are " 
            + (86400 - second));
        System.out.println("Percent of the day that has passed: " 
            + ((second / 86400.00)*100) + "%");
    }
}
