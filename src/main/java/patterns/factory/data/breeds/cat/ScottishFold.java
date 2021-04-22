package patterns.factory.data.breeds.cat;

import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;
import patterns.factory.data.breeds.Animal;

public class ScottishFold extends AnimalImpl implements Animal {
    public ScottishFold() {
        setBreed(CatType.SCOTTISH_FOLD);
        setMinLifeSpan(11);
        setMaxLifeSpan(15);
        setAnimalType(AnimalType.CAT);
    }
}
