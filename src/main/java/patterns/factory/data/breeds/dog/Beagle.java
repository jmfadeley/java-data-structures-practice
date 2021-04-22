package patterns.factory.data.breeds.dog;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class Beagle extends AnimalImpl implements Animal {

    public Beagle() {
        setBreed(DogType.BEAGLE);
        setMinLifeSpan(12);
        setMaxLifeSpan(15);
        setAnimalType(AnimalType.DOG);
    }
}
