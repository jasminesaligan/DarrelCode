import java.util.Scanner;

public class problem1
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Name that Triangle");
        System.out.println("Input 3 sides of triangle");
        
        System.out.print("Enter side: ");
        int a = scan.nextInt();
        System.out.print("Enter side: ");
        int b = scan.nextInt();
        System.out.print("Enter side: ");
        int c = scan.nextInt();
        
    if (a == b) {
        if (b == c) {
            System.out.println("The triangle is Equilateral");
        } else {
            System.out.println("The triangle is Isosceles");
        }
    } else if (a != b) {
        if (b == c) {
            System.out.println("The triangle is Isosceles");
        } else if (a == c) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }
    } else {
        System.out.println("Invalid");
    }
    }
}
