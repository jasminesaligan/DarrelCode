import java.util.Scanner;

public class SwitchWithComputation {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Hell's Kitchen");

        System.out.println("Please select the appetizers:");
        System.out.println("Enter A if you want a SEARED FOIE GRAS that costs $29.95");
        System.out.println("Enter B if you want a PAN SEARED SCALLOPS that costs $26.95");
        System.out.println("Enter C if you want a LOBSTER RISOTTO that costs  $29.95");
        System.out.println("Enter D if you want a STEAK TARTARE that costs  $26.95");
        System.out.println("Enter E if you don't want any of this");

        System.out.print("Enter your choice here: ");
        char chooseAppetizer = scan.next().charAt(0);

        System.out.println("Please select the salad/soup:");
        System.out.println("Enter A if you want a HEIRLOOM TOMATO BURRATA SALAD that costs $22.95");
        System.out.println("Enter B if you want a QUINOA SALAD that costs $19.95");
        System.out.println("Enter C if you want a CAESAR SALAD that costs  $19.95");
        System.out.println("Enter D if you don't want any of this");

        System.out.print("Enter your choice here: ");
        char chooseSalad = scan.next().charAt(0);

        System.out.println("Please select the entrees:");
        System.out.println("Enter A if you want a BEEF WELLINGTON that costs $69.95");
        System.out.println("Enter B if you want a CRISPY SKIN SALMON that costs $38.95");
        System.out.println("Enter C if you want a FILET MIGNON that costs  $55.95");
        System.out.println("Enter D if you want a MISHIMA RESERVE WAGYU RIBEYE that costs   79.95");
        System.out.println("Enter E if you want a BRAISED SHORT RIB that costs  $47.95");
        System.out.println("Enter F if you want a JIDORI CHICKEN SCALLOPINI that costs  $32.95");
        System.out.println("Enter G if you don't want any of this");

        
        System.out.print("Enter your choice here: ");
        char chooseEntrees = scan.next().charAt(0);

        System.out.println("Please select the sides:");
        System.out.println("Enter A if you want a BAKED MACARONI & CHEESE that costs  $14.95");
        System.out.println("Enter B if you want a ROASTED ASPARAGUS that costs  $14.95");
        System.out.println("Enter C if you want a HARICOT VERT that costs   $14.95");
        System.out.println("Enter D if you want a WILD MUSHROOMS that costs   $14.95");
        System.out.println("Enter E if you want a POTATO PUREE that costs   $14.95");
        System.out.println("Enter F if you don't want any of this");

        System.out.print("Enter your choice here: ");
        char chooseSides = scan.next().charAt(0);


        

        String appetizers = "";
        double price1 = 0;

        switch (chooseAppetizer) {
            case 'A', 'a':
                appetizers = "SEARED FOIE GRAS";
                price1 = 29.95;
                break;
            case 'B':
                appetizers = "PAN SEARED SCALLOPS";
                price1 = 26.95;
                break;
            case 'C':
                appetizers = "LOBSTER RISOTTO";
                price1 = 29.95;
                break;    
            case 'D':
                appetizers = "STEAK TARTARE";
                price1 = 26.95;
                break;    
            case 'E':
                appetizers = "no appetizers";
                price1 = 0;
                break;    
            default:
                System.out.println("Invalid Order");
                return;
        }

        String salad = "";
        double price2 = 0;

        switch (chooseSalad) {
            case 'A':
                salad = "HEIRLOOM TOMATO BURRATA SALAD";
                price2 = 22.95;
                break;
            case 'B':
                salad = "QUINOA SALAD";
                price2 = 19.95;
                break;
            case 'C':
                salad = "CAESAR SALAD";
                price2 = 19.95;
                break;    
            case 'D':
                salad = "no salad";
                price1 = 0;
                break;  
            default:
                System.out.println("Invalid Order");
                return;
        }

        String entrees = "";
        double price3 = 0;

        switch (chooseEntrees) {
            case 'A':
                entrees = "BEEF WELLINGTON";
                price3 = 69.95;
                break;
            case 'B':
                entrees = "CRISPY SKIN SALMON";
                price3 = 38.95;
                break;
            case 'C':
                entrees = "FILET MIGNON";
                price3 = 55.95;
                break;    
            case 'D':
                entrees = "MISHIMA RESERVE WAGYU RIBEYE";
                price3 = 79.95;
                break;    
            case 'E':
                entrees = "BRAISED SHORT RIB";
                price3 = 47.95;
                break;
            case 'F':
                entrees = "JIDORI CHICKEN SCALLOPINI";
                price3 = 32.95;
                break;     
            case 'G':
                entrees = "no entrees";
                price1 = 0;
                break;         
            default:
                System.out.println("Invalid Order");
                return;
        }
        String sides = "";
        double price4 = 0;

        switch (chooseSides) {
            case 'A':
                sides = "BAKED MACARONI & CHEESE";
                price4 = 14.95;
                break;
            case 'B':
                sides = "ROASTED ASPARAGUS";
                price4 = 14.95;
                break;
            case 'C':
                sides = "HARICOT VERT";
                price4 = 14.95;
                break;    
            case 'D':
                sides = "WILD MUSHROOMS";
                price4 =  14.95;
                break;    
            case 'E':
                sides = "POTATO PUREE";
                price4 = 14.95;
                break;      
            case 'F':
                sides = "no sides";
                price1 = 0;
                break;  
            default:
                System.out.println("Invalid Order");
                return;
        }


        

        double totalAmount = price1 + price2 + price3 + price4;

        System.out.println("Your order is: " + appetizers + ", " + salad + ", " + entrees + ", " + sides);
        System.out.println("Your total amount is: " + totalAmount);


        scan.close();
    }
}
