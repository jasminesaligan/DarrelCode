import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String MyName = newName();
        System.out.println("Your name is " + MyName);

        System.out.println(" ");

        howAreyou();
        System.out.println("That's good to hear");

        System.out.println(" ");
    
    }

    static String newName() {
        System.out.println("What is your name?");
        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        return name;
    }

    static String howAreyou() {
        System.out.println("How are you?");
        
        String answer = scan.nextLine();

        return answer;
    }

   
}
