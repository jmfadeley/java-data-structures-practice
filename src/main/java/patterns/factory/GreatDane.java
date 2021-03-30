package patterns.factory;

public class GreatDane extends Breed implements BreedDetails {

    public GreatDane() {
        this.breedName = "Great Dane";
        this.minLifeSpan = 8;
        this.maxLifeSpan = 10;
    }
}
