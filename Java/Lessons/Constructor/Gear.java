public class Gear {
    //boots
    String name;
    int defense;
    float weight;
    String rarity;
    boolean hasElementalResistance;

    public void description() {
        System.out.println("This boots is " + name + " with a defense of " + defense + " and weight of " + weight + " and is a " + rarity + " have a resistance " + hasElementalResistance);
    }
}
