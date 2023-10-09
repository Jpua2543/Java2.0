package zoo;

public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorilla threw something.");
        energy -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla's satisfaction after eating bananas.");
        energy += 10;
    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree.");
        energy -= 10;
    }
}
