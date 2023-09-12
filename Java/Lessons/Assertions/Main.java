public class Main {
    public static void main (String[] args) {

        //assertion
        Main a = new Main();

        int dividend = 5;
        int divisor = 1;

        // Precondition
        assert divisor != 0 : "The value divisor cannot be zero";

        a.divide(dividend, divisor);

        //Postcondition
        
    }

    void divide (int dividend, int divisor) {

        int a = dividend / divisor;
        System.out.println("the answer is " + a);
        

    }
}

