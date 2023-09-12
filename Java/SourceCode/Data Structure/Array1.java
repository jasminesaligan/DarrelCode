import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size( Max : 50 ) :: ");
    int a = sc.nextInt();

    if (a > 50) {
        System.out.println("Value is over 50");
    } else {

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter array[" + i + "] Element:: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Stored Data in Array: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(" \n");
        System.out.println("Duplicate Values in given Array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }

    sc.close();
        
    }

}