interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Pangasinan HundredIslands);

    void visit(Zambales Subic);

    void visit(Baguio StrawberryFarm);

    void visit(Bohol ChocolateHills);

    void visit(Batangas batangas);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}