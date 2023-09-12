import java.util.Scanner;

public class SALIGAN_POQUIZ_Nested_14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int a = sc.nextInt();

        //half left triangle
        for (int rows=1; rows<=a; rows++)
        {
            for (int column = 1; column <= rows; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //half inverted left triangle
        for (int rows=1; rows<=a-1; rows++) 
        { 
            for (int column = a-1; column >= rows; column--)
            {
                System.out.print("*");
            }
            for (int k = 1; k < rows; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }

        sc.close();
    }
}