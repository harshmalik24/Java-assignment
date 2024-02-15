import java.util.Scanner;
public class Problem5 {

    public static int incomeTax(int income){
        int tax ;                                        // initialize variable tax

        if(income <= 250000) {
            tax = 0;                                        // No tax for income up to 250000
        }

        // 10% tax on income over 250000 and less than 500000
        else if (income > 250000 && income <=500000) {
            tax = ((income-250000)*10) /100;
        }

        // 10% tax on income over 250000 and 20% tax on income between 500000 and 1000000
        else if (income > 500000 && income <=1000000) {
            tax = ((500000-250000) * 10) /100 + ((income-500000) * 20) /100;
        }

        // tax = 10% on income over 250000 + 20% on income over 500000 + 30% on income over 1000000
        else{
            tax = ((500000-250000) * 10) /100 + (1000000-500000) * 20 /100 + (income-1000000) * 30 /100;
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = sc.nextInt();
        if(income<0){                                               // Display message in case of negative input
            System.out.println("Please enter valid income.");
        }
        else{                                                       // method call to return calculated income tax
            System.out.println("Income tax: " +incomeTax(income));
        }
    }
}
