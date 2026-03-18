package Basics;

import java.util.Scanner;

public class Eligibleforvote {
    public static void Eligibility(int age){
        if(age>=18){
            System.out.print("You are eligible for vote");
        } else{
            System.out.print("You are not eligible for vote");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        Eligibility(age);
    }

}
