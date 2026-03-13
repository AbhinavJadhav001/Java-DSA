package Basics;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Electricity Units: ");
        double units = scanner.nextDouble();
        double bill;

        if (units <= 100) {
            bill = units * 5.88;
        }
        else if (units <= 300) {
            bill = units * 11.46;
        }
        else if (units <= 500) {
            bill = units * 16.64;
        }
        else {
            bill = units * 17.81;
        }

        System.out.println("Your Electricity Bill is: " + bill);

        scanner.close();
    }
}