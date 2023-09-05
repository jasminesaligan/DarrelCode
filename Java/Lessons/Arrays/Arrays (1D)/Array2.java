import java.util.Scanner;
public class Array_poquiz_2 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of storage: ");
    int a = sc.nextInt();
    int b = a+1;

    int[] arr = new int[b];
        for (int i = 1; i < b; i++) {
            System.out.print("Enter element for index[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 1; i < b; i++) {
            System.out.println(arr[i]);
        }
    }
}
