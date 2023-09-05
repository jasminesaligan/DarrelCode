import java.util.Scanner;
public class Array_poquiz_1 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int [6];
        for (int i = 1; i < 6; i++) {
            System.out.print("Enter element for index[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 6; i++) {
        }
        System.out.print("Data:" + arr[1] + "," + arr[2] + "," + arr[3] + ","+ arr[4] + "," + arr[5]);
    }
}
