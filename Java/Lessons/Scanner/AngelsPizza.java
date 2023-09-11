import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        angelsPizza();
    
    }

    static void angelsPizza() {
        System.out.print("Do you have an angels pizza card?: ");
        String angelsPizzaCard = scan.next();
        
        switch (angelsPizzaCard) {
            case "Yes", "yes":
            System.out.println("Your 2nd pizza is now free!");
                break;
        
            default:
            System.out.println("Avail Angels pizza card now!");
                break;
        }
    
    }
}
