import java.util.Scanner;

public class SALIGAN_POQUIZ_Nested_12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int a = sc.nextInt();

        for (int i=1; i<=a; i++)
        {
            for (int j=a; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if(k == 1 || k == i*2-1 || i == a)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
