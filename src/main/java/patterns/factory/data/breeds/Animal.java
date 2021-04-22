package patterns.factory.data.breeds;

public interface Animal {
    AnimalType getAnimalType();
    Breed getBreed();
    int getMinLifeSpan();
    int getMaxLifeSpan();
}
