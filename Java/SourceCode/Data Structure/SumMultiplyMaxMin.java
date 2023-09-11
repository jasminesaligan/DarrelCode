import java.util.Scanner;

public class SumMultiplyMaxMin {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int a = sc.nextInt();

        int[] numbers = new int [a];

        for (int i = 0; i < numbers.length; i++) {
           System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();  
        }

        System.out.println("values stored");
        for (int i = 0; i < numbers.length; i++) {
        
            System.out.print(numbers[i] + " ");
        }

        System.out.println(" ");

       
        int product = 1;
        int sum = 0;
        int max1 = numbers[0];
        int max2 = numbers[1];


        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max1) {
                max1 = numbers[i];
                
            } else if (numbers[i] > max2) {
                max2 = numbers[i];
            }
            sum = max1 + max2;
            product = max1 * max2;
        }
        System.out.println("maximum numbers are: " + max1);
        System.out.println("maximum numbers are: " + max2);
        System.out.println("the sum of " + max1 + " and " + max2 + " is: " + sum);
        System.out.println("the product of " + max1 + " and " + max2 + " is: " + product);

    }
}
