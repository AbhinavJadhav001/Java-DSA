package Basics;
import java.util.Scanner;
public class CurvedsurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Height of a Cylinder: ");
        double Height = scanner.nextDouble();
        System.out.println("Enter Radius of a Cylinder: ");
        double Radius = scanner.nextDouble();

        double Area;

        Area = 2 * 3.14 * Radius * Height ;

        System.out.println("The curved area of Cylinder is :" + Area);

        scanner.close();


    }
}
