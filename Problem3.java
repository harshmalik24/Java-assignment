import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();                               // input first number
        System.out.println("Enter second number: ");
        int second = sc.nextInt();                              // input second number
        System.out.println("Larger number of the two is: "+ Math.max(first,second));   // method to return largest of zero or more numbers
    }
}
