package patterns.factory.data.breeds.cat;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class Munchkin extends AnimalImpl implements Animal {
    
    public Munchkin() {
        setBreed(CatType.MUNCHKIN);
        setMinLifeSpan(12);
        setMaxLifeSpan(15);
        setAnimalType(AnimalType.CAT);
    }
}
