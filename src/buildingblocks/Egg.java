package buildingblocks;

public class Egg {

    // Then the constructor - 3
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    // Fields are run first - 1
    private int number = 3;

    // Then blocks - 2
    { number = 4;}
}
