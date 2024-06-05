import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double X;
        double Y;
        double Z;

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X:");
        X = scanner.nextDouble();
        System.out.println("Enter side Y:");
        Y = scanner.nextDouble();
        Z = Math.sqrt((X*X) + (Y*Y));

        System.out.println("The hypotenuse is "+Z);

        scanner.close();

    }
}