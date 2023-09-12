import java.util.Scanner;
public class Square {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner (System.in);

    System.out.print("Enter the value: ");


    int a = sc.nextInt();

    //Square
     // oustide loop - row
        for (int rows = 1; rows <= a; rows++) {
            
           // inside loop - column represents " * "
            for (int columns = 1; columns <= a; columns++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        sc.close();

    }
}
