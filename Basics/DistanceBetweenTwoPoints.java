package Basics;
import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter X1: ");
        Double X1 = sc.nextDouble();

        System.out.print("Enter X2: ");
        Double X2 = sc.nextDouble();

        System.out.print("Enter Y1: ");
        Double Y1 = sc.nextDouble();

        System.out.print("Enter Y2: ");
        Double Y2 = sc.nextDouble();

        Double distance = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
        System.out.print(" The distance between two points is: "+ distance);

        sc.close();



    }

}
