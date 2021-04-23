package patterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.factory.data.breeds.AnimalType;
import patterns.factory.data.breeds.Animal;

@Data
@AllArgsConstructor
public class Pet {
    
    String name;
    int age;
    Animal breed;
    AnimalType animalType;

    public Pet(String name, int age, Animal breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.animalType = breed.getAnimalType();
    }
}
