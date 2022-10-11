import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double longA = 0;
        double shortA = 0;
        double area = 0;
        double perimeter = 0;
        double diagn = 0;

        System.out.println("Enter the length of the side: ");
        if (in.hasNextDouble())
        {
            longA = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("Not a valid input");
            System.exit(0);
        }
        System.out.println("Enter the Width of the side: ");
        if (in.hasNextDouble())
        {
            shortA = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("Not a valid input");
            System.exit(0);
        }
        {
            System.out.println("Area equals:  " +longA * shortA);
            System.out.println("Perimeter equals: " + (2*longA)+(2*shortA));
            System.out.println("Diag equals: " + (Math.sqrt(Math.pow(longA,2)) + (Math.pow(shortA,2))));
        }

    }
}