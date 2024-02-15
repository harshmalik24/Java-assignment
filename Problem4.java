import java.util.Scanner;
public class Problem4 {
    public static double medianOf(double[] arr, int size){
        if(size<1){                                         // return -1.0 for empty array
            return -1.0;
        }
        if(size%2!=0) {
            return arr[size/2];                             // median formula n/2 if array size is odd
        }
        else{
            return (arr[size/2]+arr[(size/2)-1])/2;         // median formula (n/2+(n/2)-1)/2 if array size is even
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();                                 // input array size
        double[] arr = new double[size];                         // initialize array 
        for(int i=0; i<size; i++) arr[i] = sc.nextDouble();      // loop to input array
        System.out.println(medianOf(arr, size));
    }
}
