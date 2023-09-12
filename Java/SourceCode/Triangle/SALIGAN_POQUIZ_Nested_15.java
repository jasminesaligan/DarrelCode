import java.util.Scanner;
public class SALIGAN_POQUIZ_Nested_15 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();
    
    for (int rows=1; rows<=a; rows++)
    {
        for (int column=1; column<=rows; column++)
        {
            if( column == 1 || column == rows )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    
    for (int rows=1; rows<=a-1; rows++)
    {
        
        for (int column = a-1; column >= rows; column--)
        {
            if( column == a-1 || column == rows || rows == a)
                System.out.print("*");
            else
                System.out.print(" ");
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