package patterns.factory;

public class Beagle extends Breed implements BreedDetails {

    public Beagle() {
        this.breedName = "Beagle";
        this.minLifeSpan = 12;
        this.maxLifeSpan = 15;
    }
}
