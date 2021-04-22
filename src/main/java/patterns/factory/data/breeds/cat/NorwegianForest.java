package patterns.factory.data.breeds.cat;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class NorwegianForest extends AnimalImpl implements Animal {
    public NorwegianForest() {
        setBreed(CatType.NORWEGIAN_FOREST);
        setMinLifeSpan(8);
        setMaxLifeSpan(14);
        setAnimalType(AnimalType.CAT);
    }
}
