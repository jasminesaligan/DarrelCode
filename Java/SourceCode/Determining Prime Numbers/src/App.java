public class App {
    public static void main(String[] args) {
        int n = 131; 
        System.out.println("list of all prime numbers in " + n + ": ");
        primes(n, 0);
    }

    public static void primes(int n, int L) {
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print((i += L) + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}