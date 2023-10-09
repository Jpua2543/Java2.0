package zoo;

public class Gorilla extends Mammal {

    public void throwSomething() {
        energy -= 5;
        System.out.println("Gorilla threw something.");
    }

    public void eatBananas() {
        energy += 10;
        System.out.println("Gorilla's satisfaction after eating bananas.");
    }

    public void climb() {
        energy -= 10;
        System.out.println("Gorilla has climbed a tree.");
    }
}
