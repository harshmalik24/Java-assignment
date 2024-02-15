import java.util.Scanner;
public class Problem2 {
    public static double grossPrice(double net_price, double tax_rate){
        double gross_price = net_price/(1+tax_rate);             // formula to find gross price
        gross_price = Math.round(gross_price*100.0)/100.0;       // rounding off gross price to 2 decimal places
        return gross_price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Net price:");
        double net_price = sc.nextDouble();                      // input net price
        System.out.println("Enter Tax rate:");
        double tax_rate = sc.nextDouble();                       // input tax rate
        System.out.println("Gross price = "+grossPrice(net_price, tax_rate));
    }
}
