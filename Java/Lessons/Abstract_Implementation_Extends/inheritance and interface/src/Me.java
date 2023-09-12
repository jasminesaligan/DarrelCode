public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        //Define your visit

        System.out.println("Borcay's airFare is " + boracay.airFare);

        if (budget > boracay.airFare) {
            System.out.println("The white sand is so beautiful");
            budget = budget - boracay.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 100 and your budget is " + budget + "\n");
        }

    }

    public void visit(Pangasinan HundredIslands) {

        // Define your visit

        System.out.println("Pangasinan's Hundred Islands airFare is " + HundredIslands.airFare);
        
        if (budget > HundredIslands.airFare) {
            System.out.println("The islands are a masterpiece");
            budget = budget - HundredIslands.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 200 and your budget is " + budget + "\n");
        }
    }

    public void visit(Zambales Subic) {

        // Define your visit

        System.out.println("Zambales' Subic airFare is " + Subic.airFare);

        if (budget > Subic.airFare) {
            System.out.println("The wind is so calming");
            budget = budget - Subic.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 300 and your budget is " + budget + "\n");
        }

    }

    public void visit(Baguio StrawberryFarm) {

        // Define your visit
        
        System.out.println("Baguio's Strawberry Farm airFare is " + StrawberryFarm.airFare);

        if (budget > StrawberryFarm.airFare) {
            System.out.println("The strawberries are delicious");
            budget = budget - StrawberryFarm.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 250 and your budget is " + budget + "\n");
        }

    }

    public void visit(Bohol ChocolateHills) {

        // Define your visit

        System.out.println("Bohol's Chocolate Hills airFare is " + ChocolateHills.airFare);
        
        if (budget > ChocolateHills.airFare) {
            System.out.println("The hills really does look like a chocolate");
            budget = budget - ChocolateHills.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 150 and your budget is " + budget + "\n");
        }
    }

    public void visit(Batangas batangas) {

        // Define your visit

        System.out.println("Batangas' airFare is " + batangas.airFare);
        
        if (budget > batangas.airFare) {
            System.out.println("The beach in here is relaxing");
            budget = budget - batangas.airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 350 and your budget is " + budget + "\n");
        }
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }

}