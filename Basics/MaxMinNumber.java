package Basics;
import java.util.Scanner;
public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is the program to find the largest & smallest number among three");

        System.out.println("Enter the first number: ");
        int first = sc.nextInt();

        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        System.out.println("Enter the third number: ");
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("The largest number among %d %d & %d is: %d %n" , first, second, third, largest);
        System.out.printf("The smallest number among %d %d & %d is: %d %n", first, second, third, smallest);

        sc.close();


    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;

        }
        if (third > max) {
            max = third;
        }
        return max;
    }


    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}