public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean ihaveNoMoney = false;

        if (ihaveNoMoney) {
            System.out.println("ask jas some money");
        } else {
            // Step 1
            walkToLRT2();

            // Step 2
            LRT2toLegarda();

            // Step 3
            WalkToNU();

            // Step 4
            // rideTricycle();

            // // Step 5
            // walk();
        }

    }

    static void walkToLRT2() {
        System.out.println("Dumaan sa shortcut ng SM masinag");
        System.out.println("from shortcut to LRT2 masinag station");
    }

    static void LRT2toLegarda() {
        System.out.println("Masinag station to Legarda Station");
        System.out.println("Chill lang sa train");
    }

    static void WalkToNU() {
        System.out.println("Walk from Legarda station to NU");
        System.out.println("tas pasok na sa school yehey!");
    }

    // static void rideTricycle() {
    //     System.out.println("Ride tricycle at Figueras Street");
    //     System.out.println("Exit tricycle at Jhocson Street");
    // }

    // static void walk() {
    //     System.out.println("Walk for 3 mins");
    // }
}
