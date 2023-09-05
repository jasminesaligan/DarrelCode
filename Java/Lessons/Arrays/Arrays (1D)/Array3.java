import java.util.Scanner;
public class Array_poquiz_3 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of storage: ");
    int a = sc.nextInt();

    int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element for index[" + (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Data: ");

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < a/2; i++) {
            int temp = arr[i];
            arr[i] = arr[a-1-i];
            arr[a-1-i] = temp;
        }
        System.out.println(" ");
        System.out.print("Reversed Array: ");
        for (int i = 0; i < a; i++) {
        System.out.print(arr[i] + " ");
     }
    }
}
