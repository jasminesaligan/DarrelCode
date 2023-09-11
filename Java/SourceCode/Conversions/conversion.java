public class App {

    static Scanner scan = new Scanner(System.in);

    // Answers
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

        // Part 1: Conversions
        // Print the converted values

        // 1. Create a method to convert celsius to fahrenheit.
        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        double toFarenheit = ((tempInCelsius * 1.8) + 32);
        System.out.println(tempInCelsius + " is equal to " + toFarenheit + "°F");

        // // 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = scan.nextDouble();
        double toCelsius = ((tempInFahrenheit - 32) * 0.55555555555555555555555555555556);
        System.out.println(tempInFahrenheit + " is equal to " + toCelsius + "°C");

        // // 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = (seconds / 60);
        System.out.println(seconds + " is equal to " + minutes);

        // // 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        double minute = (hours * 60);
        System.out.println(hours + " is " + minute + " in minutes");

        // // 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        double gigabytes = (megabytes / 1000);
        System.out.println(megabytes + " is equel to " + gigabytes);

        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given mobile number is valid

        System.out.print("Enter your 11 digit mobile number: ");
        String mobileNumber = scan.next();
        if (mobileNumber.length()==11) {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("invalid");
        }

        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();
        if (bestfriend == bestfriend.toUpperCase()) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid");
        }

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
        String capital = scan.next();
        if (capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("Manila")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");            
        }

        // 9. Create a condition to check if the answer belongs to one of the five human senses
        // sight
        // touch
        // hearing
        // smell
        // taste

        System.out.print("Enter one of the five human senses: ");
        String sense = scan.next();
        switch (sense) {
            case "sight":
                System.out.println("kurik");
                break;
            case "touch":
                System.out.println("kurik");
                break;
            case "hearing":
                System.out.println("kurik");
                break;
            case "smell":
                System.out.println("kurik");
                break;
            case "taste":
                System.out.println("kurik");
                break;
            default:
                System.out.println("not kurik");
                break;
        }
    }
}
