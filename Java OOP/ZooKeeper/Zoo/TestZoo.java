package zoo;

public class TestZoo {

    public static void main(String[] args) {
        // Gorilla tested
        Gorilla g = new Gorilla();
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBananas();
        g.eatBananas();
        g.climb();
        g.displayEnergy();

        // Bat tested
        Bat b = new Bat();
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();
        b.fly();
        b.displayEnergy();
    }
}
