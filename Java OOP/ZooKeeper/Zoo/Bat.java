package zoo;

public class Bat extends Mammal {

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        energy -= 50;
        System.out.println("Bat is flying.");
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("Yum... Bat just ate a human.");
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("Bat attacked a town. Fire everywhere!");
    }
}
