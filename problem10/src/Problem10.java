import java.util.Scanner;
import java.util.Arrays;
public class Problem10 {

    public static int secondLargest(int[] arr){
        Arrays.sort(arr);                          // Inbuilt method for sorting arrays
        return arr[arr.length-2];                  // returns second-largest element in case of sorted array
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){                   // loop to input array
            arr[i]=sc.nextInt();
        }
        if(size<2){                                // conditional statement to ensure proper array size input
            System.out.println("Please enter at least 2 elements to find second largest.");
        }
        else {
            System.out.println("The second largest element is " + secondLargest(arr));
        }
    }
}