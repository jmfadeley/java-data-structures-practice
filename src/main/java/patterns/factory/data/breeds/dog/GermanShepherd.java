package patterns.factory.data.breeds.dog;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class GermanShepherd extends AnimalImpl implements Animal {

    public GermanShepherd() {
        setBreed(DogType.GERMAN_SHEPHERD);
        setMinLifeSpan(9);
        setMaxLifeSpan(13);
        setAnimalType(AnimalType.DOG);
    }
}
