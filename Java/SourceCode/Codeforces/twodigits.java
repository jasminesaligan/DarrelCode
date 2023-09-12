import java.util.Scanner;
 
public class twodigits {
    
    // Suneet has three digits a, b, and c.

    // Since math isn't his strongest point, he asks you to determine if you can choose 
    // any two digits to make a sum greater or equal to 10.

    // Output "YES" if there is such a pair, and "NO" otherwise
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
			if (a + b >= 10 || b + c >= 10 || a + c >= 10) System.out.println("YES");
			else System.out.println("NO");
		}

        s.close();
	}
 
}