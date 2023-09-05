import java.util.Scanner;
public class Array_poquiz_6 {
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

        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    System.out.println(" ");
       System.out.print("Sorted Array: ");
       for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
