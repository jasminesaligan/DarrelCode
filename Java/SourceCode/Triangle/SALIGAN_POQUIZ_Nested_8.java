import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_8 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();

    for (int rows = 1; rows <= a; rows++) {
            System.out.print("\n");
            for (int column = rows; column <= a; column++) {
                System.out.print("   ");
            }
            for (int column1 = 1; column1 <= rows; column1++) {
                if (rows == 1 || rows == a || column1 == rows || column1 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                } 
            }
        }
        sc.close();

    }
}