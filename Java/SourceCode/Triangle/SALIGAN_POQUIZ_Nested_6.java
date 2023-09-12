import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_6 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();

      for (int rows = 1; rows <= a; rows++) {
        System.out.print("\n");
          for (int columns = rows; columns <= a; columns++) {
              System.out.print("   ");
          }
          for (int column1 = 1; column1 <= rows; column1++) {
                System.out.print(" * ");
          }
      }
      sc.close();

    }
}