import java.util.Scanner;
public class RightAngle {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");

    //right angle triangle
    int a = sc.nextInt();
     for (int rows = 1; rows <= a; rows++) {
            System.out.print("\n");
            for (int column = 1; column <= rows; column++) {
                System.out.print(" * ");
            }
        }
        sc.close();
    }
}