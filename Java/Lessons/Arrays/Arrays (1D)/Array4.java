import java.util.Scanner;
public class Array_poquiz_4 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of storage: ");
    int a = sc.nextInt();

    float[] arr = new float[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element for index[" + (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }
        float sum=0;
        for (int i = 0; i < a; i++) {
            sum += arr[i];
        }
        float ave = sum/a;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + ave);
    }
}
