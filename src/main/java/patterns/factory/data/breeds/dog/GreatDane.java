package patterns.factory.data.breeds.dog;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class GreatDane extends AnimalImpl implements Animal {

    public GreatDane() {
        setBreed(DogType.GREAT_DANE);
        setMinLifeSpan(8);
        setMaxLifeSpan(10);
        setAnimalType(AnimalType.DOG);
    }
}
