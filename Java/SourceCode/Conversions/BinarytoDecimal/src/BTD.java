public class BTD {
    
    public static int binaryToDecimal(int n, int d, int w) {

        if (n > 0) {
            int bit = n % 10;
            d += bit * Math.pow(2, w);
            n /= 10;
            w++;
            return binaryToDecimal(n, d, w);
        } else {
            return d;
        }

    }

    public static void main(String[] args) throws Exception {

        //11111, 10001, 1010, 11011, 100
        int n = 100;
        int d = 0;
        int w = 0;
        int decimalnumber = binaryToDecimal(n, d, w);
        System.out.println("The decimal representation of " + n + " is : " + decimalnumber);

    }


}
