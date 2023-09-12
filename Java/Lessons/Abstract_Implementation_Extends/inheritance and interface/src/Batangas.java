public class Batangas implements Locations {

    int airFare = 350;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}
