import java.util.Scanner;
public class Problem7 {
    static int principal = 1;                             //principal take as 1 because it represents the cost of good
    public static double retailInflation(double inflation_rate, int year){
        // formula to calculate compound retail inflation
        double retail_inflation = (principal * Math.pow(1 + inflation_rate / 100, year));
        return Math.round(retail_inflation * 100.00) / 100.00;                          // round off to 2 digits
    }

    public static double percentInflation(double inflation_rate, int year){
        // formula to calculate compound retail inflation
        double retail_inflation = (principal * Math.pow(1 + inflation_rate / 100, year));
        // to calculate compound retail inflation in percent
        double percent_inflation = ((retail_inflation - principal) / principal) * 100;
        return Math.round(percent_inflation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of inflation in percent: ");
        double inflation_rate = sc.nextDouble();
        System.out.println("Enter the time in years: ");
        int year = sc.nextInt();
        System.out.println(retailInflation(inflation_rate, year));
        System.out.println(percentInflation(inflation_rate, year) + "%");
    }
}