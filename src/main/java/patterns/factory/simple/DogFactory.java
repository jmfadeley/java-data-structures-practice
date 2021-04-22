package patterns.factory.simple;

import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.dog.Beagle;
import patterns.factory.data.breeds.dog.DogType;
import patterns.factory.data.breeds.dog.GermanShepherd;
import patterns.factory.data.breeds.dog.GreatDane;

/**
 * Best explained, this is factory and NOT abstract factory. From what I gather,
 * abstract uses composition while this uses inheritance. So while easier to
 * understand, factory may not be quite as useful.
 */
public class DogFactory {
    private DogFactory() { }

    public static AnimalImpl create(String breedType) {
        if (DogType.BEAGLE.checkBreed(breedType)) {
            return new Beagle();
        } else if (DogType.GERMAN_SHEPHERD.checkBreed(breedType)) {
            return new GermanShepherd();
        } else if (DogType.GREAT_DANE.checkBreed(breedType)) {
            return new GreatDane();
        }

        return null;
    }
}
