package patterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    
    String name;
    int age;
    Breed breed;
}
