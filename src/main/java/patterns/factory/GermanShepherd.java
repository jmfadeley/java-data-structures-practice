package patterns.factory;

public class GermanShepherd extends Breed implements BreedDetails {

    public GermanShepherd() {
        this.breedName = "German Shepherd";
        this.minLifeSpan = 9;
        this.maxLifeSpan = 13;
    }
}
