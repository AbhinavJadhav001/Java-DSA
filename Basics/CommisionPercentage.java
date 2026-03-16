package Basics;

import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales: ");
        Double sales = sc.nextDouble();

        System.out.print("Enter Commission amount: ");
        Double Commission = sc.nextDouble();

        Double cPercent = (Commission/sales)*100;

        System.out.print("The commission percentage is: "+cPercent + "%");

        sc.close();
    }
}
