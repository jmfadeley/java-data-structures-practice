package patterns.factory.data.breeds;

import lombok.Data;

@Data
public abstract class AnimalImpl {
    Breed breed;
    int minLifeSpan;
    int maxLifeSpan;
    AnimalType animalType;

    public Breed getBreed() {
        return breed;
    }

    public int minLifeSpan() {
        return minLifeSpan;
    }

    public int maxLifeSpan() {
        return maxLifeSpan;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }
}
