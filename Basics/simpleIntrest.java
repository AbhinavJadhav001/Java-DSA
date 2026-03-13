package Basics;
import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Principle Amount (integer):");
    int principal = scanner.nextInt();
    System.out.println("Enter Rate of intrest (integer):");
    int rate = scanner.nextInt();
    System.out.println("Enter Time in Years (integer):");
    int time = scanner.nextInt();

    int interest = (principal * rate * time) / 100;
    System.out.println("The simple intrest is:"+interest);

    }
}

