import java.util.Scanner;
public class Problem9 {
    public static boolean specialInteger(int number){
        if (number >= 10 && number<=99){                                             // condition to ensure number is 2 digit only
            int tensDigit = number/10;                                               // finding tens place digit
            int unitsDigit = number%10;                                              // finding units place digit
            
            // checking if number is special integer or not
            int sum = tensDigit + unitsDigit + (tensDigit * unitsDigit); 
            return sum == number;                                                    // will return true only when the number is 2 digit special integer
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 digit number: ");
        int number= sc.nextInt();
        if (specialInteger(number)){                                                  // function will return true if number is 2 digit special number
            System.out.println(number + " is a two-digit special integer");
        }
        else{
            System.out.println(number + " is not a two-digit special integer");
        }

    }
}
