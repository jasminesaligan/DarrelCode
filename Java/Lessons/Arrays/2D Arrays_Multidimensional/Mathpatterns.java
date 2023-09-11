public class Mathpatterns {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    

        int sum = 0;

        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");

            for (int column = 0; column < mdArray.length; column++) {
                System.out.print(mdArray[row][column] + " ");
            } 
        }
  
        // PATTERN 1 SUM OF ALL NUMBERS
        System.out.println("\n");
        System.out.println("1. SUM OF PATTERN 1");
        
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                sum += mdArray[row][column];
            } 
        }

        System.out.println("the sum of the array is: " + sum);

        // PATTERN 2 SUM OF ROW 1
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");

        sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                if (row == 0) {
                    sum += mdArray[row][column]; 
                }
            } 
        }
        System.out.println("the sum of this pattern 2 is: " + sum);

        // PATTERN 3 SUM OF ROW 1 and Column 1
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");

        sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                if (row == 0 || column == 0) {
                    sum += mdArray[row][column]; 
                }
            } 
        }
        System.out.println("the sum of this pattern 3 is: " + sum);
        
        // PATTERN 4 SUM of 1 4 13 16
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");

        sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                if (row == 0 && (column == 0 || column == 3)) {
                    sum += mdArray[row][column];
                } else if (row == 3 && (column == 0 || column == 3)) {
                    sum += mdArray[row][column];
                }
            } 
        }
        System.out.println("the sum of this pattern 4 is: " + sum);
        
        // PATTERN 5 SUM of 6 7 10 11
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");

        sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                if (row == 1 && (column == 1 || column == 2)) {
                    sum += mdArray[row][column];
                } else if (row == 2 && (column == 1 || column == 2)) {
                    sum += mdArray[row][column];
                }
            } 
        }
        System.out.println("the sum of this pattern 5 is: " + sum);
      
        // PATTERN 6 SUM of 1 4 6 7 10 11 13 16
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

        sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < mdArray.length; column++) {
                
                if (row == 1 && (column == 1 || column == 2)) {
                    sum += mdArray[row][column];
                } else if (row == 2 && (column == 1 || column == 2)) {
                    sum += mdArray[row][column];
                } else if (row == 0 && (column == 0 || column == 3)) {
                    sum += mdArray[row][column];
                } else if (row == 3 && (column == 0 || column == 3)) {
                    sum += mdArray[row][column];
                }
            } 
        }
        System.out.println("the sum of this pattern 5 is: " + sum);
    }
  }
