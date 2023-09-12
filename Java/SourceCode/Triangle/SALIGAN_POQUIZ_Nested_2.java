import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_2 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
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