import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();                   // taking user input
        int digit = 0;                            // initialising variable digit to store the number to digits in the integer
        num = Math.abs(num);                      // method to return absolute or positive value in case integer is negative
        while (num>0) {                           // loop to calculate number of digits in integer
            num /= 10;
            digit++;
        }
        System.out.println(digit);
    }
}



