import java.util.Scanner;
public class Problem9 {
    public static boolean specialDigit(int number){
        if (number >= 10 && number<=99){
            int tensDigit = number/10;
            int unitsDigit = number%10;
            int sum = tensDigit + unitsDigit + (tensDigit * unitsDigit);
            return sum == number;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 digit number: ");
        int number= sc.nextInt();
        if (specialDigit(number)){
            System.out.println(number + " is a two-digit special integer");
        }
        else{
            System.out.println(number + " is not a two-digit special integer");
        }

    }
}