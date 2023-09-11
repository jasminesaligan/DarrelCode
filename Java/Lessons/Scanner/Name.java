import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        myName();
    }

    static void myName(){
        System.out.print("Hello, what is your name?: ");
        String name = scan.next();
        System.out.println("Your name is " + name);

        System.out.println("How are you? Are you good?");
        
        String ans = scan.next();
        switch (ans) {
            case "Yes","yes":
                System.out.println("then you must be feeling great today");
                break;
            case "No","no":
                System.out.println("ohh :< why? are you feeling down? do you need someone to talk to?");
                break;
            default:
                System.out.println("pardon? Again please");
                break;
        }
        String ans2 = scan.next();
        switch (ans2) {
            case "yes","Yes","Yep","yep","Yeah","yeah":
                System.out.println("You can just share anything you want to me and don't worry it will be safe with me, it will be our secret :>");
                break;
        
            default:
                break;
        }
    }

}
