import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_10 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();

    for (int row = 1; row <= a; row++) {
                
        for (int column = 1  ; column <= a-row; column++) {
            System.out.print("   ");
        }

        for (int column = 1; column <= row*2-1 ; column++) {
            
            System.out.print(" * ");
        }
        
        System.out.println();
    }

    sc.close();

    }
}