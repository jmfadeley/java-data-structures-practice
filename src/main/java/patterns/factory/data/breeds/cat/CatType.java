package patterns.factory.data.breeds.cat;

import patterns.factory.data.breeds.Breed;

public enum CatType implements Breed {
    MUNCHKIN("Munchkin"),
    NORWEGIAN_FOREST("Norwegian Forest"),
    SCOTTISH_FOLD("Scottish Folder");

    private String breed;
    private CatType(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean checkBreed(String givenBreed) {
        return breed.equalsIgnoreCase(givenBreed);
    }
}
