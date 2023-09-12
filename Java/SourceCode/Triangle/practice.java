import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // System.out.print("Enter value: ");
    // int a = sc.nextInt();
    
    //square
    // for (int rows = 1; rows <= a; rows++) {
    //     System.out.print("\n");
    //     for (int column = 1; column <= a; column++) {
    //         System.out.print(" * ");
    //     }
    // }

    //HOLLOW SQUARE
    // for (int rows = 1; rows <= a; rows++) {
    //     System.out.print("\n");
    //     for (int column = 1; column <= a; column++) {
    //         if (rows == 1 || rows == a || column == 1 || column == a) {
    //             System.out.print(" * ");
    //         } else {
    //             System.out.print("   ");
    //         }
    //     }
    // }

    //left triangle
    // for (int rows = 1; rows <= a; rows++) {
    //     System.out.print("\n");
    //     for (int column = 1; column <= rows; column++) {
    //         System.out.print(" * ");
    //     }
    // }

    //inverted left triangle
    // for (int rows = a; rows >= 1; rows--) {
    //     System.out.print("\n");
    //     for (int column = 1; column <= rows; column++) {
    //         System.out.print(" * ");
    //     }
    // }

    //RIGHT HALF TRIANGLE
    // for (int rows = 1; rows <= a; rows++) {
    //     System.out.print("\n");
    //     for (int column = rows; column <= a; column++) {
    //         System.out.print("   ");
    //     }
    //     for (int column1 = 1; column1 <= rows; column1++) {
    //         System.out.print(" * ");
    //     }
    // }

    //RIGHT HOLLOW TRIANGLE
    // for (int rows = 1; rows <= a; rows++) {
    //     System.out.print("\n");
    //     for (int column = rows; column <= a; column++) {
    //         System.out.print("   ");
    //     }
    //     for (int column1 = 1; column1 <= rows; column1++) {
    //         if (rows == 1 || rows == a || column1 == rows || column1 == 1) {
    //             System.out.print(" * ");
    //         } else {
    //             System.out.print("   ");
    //         } 
    //     }
    // }

    //INVERTED HOLLOW TRIANGLE
    // for (int rows = a; rows >= 1; rows--) {
    //     System.out.print("\n");
    //     for (int column = rows; column <= a; column++) {
    //         System.out.print("   ");
    //     }
    //     for (int column1 = 1; column1 <= rows; column1++) {
    //         if (rows == 1 || rows == a || column1 == rows || column1 == 1) {
    //             System.out.print(" * ");
    //         } else {
    //             System.out.print("   ");
    //         } 
    //     }
    // }

    //FULL TRIANGLE
    // for (int row = 1; row <= a; row++) {
                
    //     for (int column = 1  ; column <= a-row; column++) {
    //         System.out.print("   ");
    //     }

    //     for (int column = 1; column <= row*2-1 ; column++) {
            
    //         System.out.print(" * ");
    //     }
        
    //     System.out.println();
    // }

    // System.out.print("Enter the number of rows: ");
    // int rows = sc.nextInt();

    // System.out.print("Enter the number of columns: ");
    // int columns = sc.nextInt();

    // int array[][]= new int[rows][columns];

    // System.out.println("Enter the elements of the array[" + rows*columns + "]:");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         array[i][j] = sc.nextInt();
    //     }
    // }

    // sc.close();

    // System.out.println("The 2D array is:");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         System.out.print(array[i][j] + " ");
    //     }
    // System.out.println();
    // }


    // System.out.println("Enter size of the array: ");
    // System.out.print("Enter rows: ");
    // int rows = sc.nextInt();
    
    // System.out.print("Enter columns: ");
    // int columns = sc.nextInt();

    // int [][] array = new int[rows][columns];
    // System.out.print("Enter" + " " + (rows * columns) + " " + "element: ");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         array[i][j] = sc.nextInt();
    //  }    
    // }

    // System.out.println("The array is : ");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         System.out.print(array [i][j] + "  ");
    //     }
    //  System.out.println();
    // }

    // System.out.print("How many words do you want?: ");
    // int words = sc.nextInt();

    System.out.print("Enter a word or phrase: ");
    String inputString = sc.nextLine();

    char[][] array1 = new char [1][inputString.length()];

    for (int i = 0; i < inputString.length(); i++) {
        array1[0][i] = inputString.charAt(i);
    }
    sc.close();

    System.out.println("The 2D array is: ");
    for (int i = 0; i < 1; i++) {
        for (int j = 0; j < inputString.length(); j++) {
            System.out.print(array1[i][j] + " ");
        }
        System.out.println();
    }
    }
}
