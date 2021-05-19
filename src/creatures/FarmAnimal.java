package creatures;

public class FarmAnimal extends Animal implements edible {


    public FarmAnimal(String species, double weight) {
        super(species, weight);
    }

    @Override
    public void beEaten() {
        System.out.println("You are died now...");
    }
}
