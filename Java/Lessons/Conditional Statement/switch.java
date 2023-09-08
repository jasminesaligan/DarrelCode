public class App {
    public static void main(String[] args) throws Exception {

        String today = "monday";

        switch (today) {
            case "monday":
                System.out.println("monday nanaman :<");
                break;
            case "tuesday":
                System.out.println("Ang aga ko nanaman gigising!");
                break;
            case "wednesday":
                System.out.println("Finally, rest day");
                break;
            case "thursday":
                System.out.println("Sheeshh coding time");
                break;
            case "friday":
                System.out.println("Online class nanaman ugh");
                break;
            case "saturday":
                System.out.println("Magdrawing");
                break;
            case "sunday":
                System.out.println("Tumugtog sa church");
                break;
            default:
                System.out.println("noob, araw ang ilagay mo");
                break;
        }

    }
}
