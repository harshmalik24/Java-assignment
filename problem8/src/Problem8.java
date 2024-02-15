import java.util.Scanner;
public class Problem8 {

    public static Object convertFromSeconds(int sec){
        // converting seconds to days by dividing total seconds by seconds in 1 day(24*3600)
        int days = sec / (24 * 3600);
        sec = sec % (24 * 3600);                    // remaining time in seconds

        int hours = sec / 3600;                     // converting into hours by dividing with seconds in 1 hour(3600)
        sec %= 3600;                                // remaining time in seconds

        int minutes = sec / 60 ;                    // converting into minutes by dividing with seconds in 1 minute (60)
        sec %= 60;                                  // remaining time in seconds

        int  seconds = sec;                         // calculating seconds left

        // printing output in desired format
        return days + " Days(s) " + hours + " Hours(s) " + minutes + " Minutes(s) " + seconds + " Seconds(s)";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        System.out.println(convertFromSeconds(sec));
    }
}