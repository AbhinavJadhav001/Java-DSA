package Day02;

import java.util.Scanner;

// Subtract the Product and Sum of Digits of an Integer
public class subtractProductAndSum {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;

            product = product * temp;
            sum = sum + temp;

            n = n / 10;
        }

        int result = product - sum;

        System.out.println("Result = " + result);

        sc.close();
    }
}