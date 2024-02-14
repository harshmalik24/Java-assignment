import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        if(n>0 && n<2147483647) {             // input number n should be in positive integer range
            for(int i =0; i<n; i++){           // loop for rows
                for(int j =0; j<=i; j++){      // loop for columns
                    System.out.print(n);
                }
                System.out.println();
            }
        }
        else{                                  // if the number is out of positive integer range display message
            System.out.println("Please enter valid number.");
        }
    }
}
