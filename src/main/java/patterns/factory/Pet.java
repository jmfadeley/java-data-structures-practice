package patterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.AnimalImpl;

@Data
@AllArgsConstructor
public class Pet {
    
    String name;
    int age;
    AnimalImpl breed;
    AnimalType animalType;

    public Pet(String name, int age, AnimalImpl breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.animalType = breed.getAnimalType();
    }
}
