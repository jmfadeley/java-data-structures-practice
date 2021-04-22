package patterns.factory.data.breeds.dog;

import patterns.factory.data.breeds.Breed;

public enum DogType implements Breed {
    BEAGLE("Beagle"),
    GERMAN_SHEPHERD("German Shepherd"),
    GREAT_DANE("Great Dane");

    private String breed;
    private DogType(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public boolean checkBreed(String givenBreed) {
        return breed.equalsIgnoreCase(givenBreed);
    }
}
