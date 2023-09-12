import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_17 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();
    
    for (int rows = 1; rows <= a; rows++)
    {
        // Print space in decreasing order
        for (int column = a; column > rows; column--)
        {
            System.out.print(" ");
        }
        // Print star in increasing order
        for (int k = 1; k <= rows; k++)
        {
            if( k == 1 || k == rows )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    for (int rows = 1; rows <= a-1; rows++)
    {
        // Print space in increasing order
        for (int column = 1; column <= rows; column++)
        {
            System.out.print(" ");
        }
        // Print star in decreasing order
        for (int k = a-1; k >= rows; k--)
        {
            if( k == a-1 || k == rows )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    sc.close();


    }
}
