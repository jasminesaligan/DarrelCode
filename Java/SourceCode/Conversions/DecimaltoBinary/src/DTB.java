public class DTB {

  public static void decimalToBinary(int n) {
    if (n > 0) {
      decimalToBinary(n / 2);
      System.out.print(n % 2);
    }  
  }

  public static void main(String[] args) throws Exception {

    //65, 100, 5, 25, 10

    int decimalnumber = 65;

    System.out.print("Binary representation of " + decimalnumber  + ": ");
    decimalToBinary(decimalnumber);
    System.out.println();

  }
    
 
}
