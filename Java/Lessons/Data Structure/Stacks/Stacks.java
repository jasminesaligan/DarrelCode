import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        System.out.print("Input a word: ");
        String inputString = sc.nextLine();

        
        //String will be stored in the stack one by one
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        //String will be pop
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        

        if (stringOnly(inputString)) {
            
            System.out.println("Original String: " + inputString);
            System.out.println("Reversed String: " + reversedString);

        } else {
            System.out.println("invalid input, String only ");
        }
        
        sc.close();
    }

    public static boolean stringOnly(String input){
        return !input.isEmpty() && input.matches("^[a-zA-Z]*$");
    }


    
    
}