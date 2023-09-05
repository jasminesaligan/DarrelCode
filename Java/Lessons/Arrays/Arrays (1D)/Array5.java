import java.util.Scanner;
public class Array_poquiz_5 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of storage: ");
    int a = sc.nextInt();

    int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element for index[" + (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < a; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
    }
}
