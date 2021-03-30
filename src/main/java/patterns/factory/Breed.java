package patterns.factory;

import lombok.Data;

@Data
public abstract class Breed {
    String breedName;
    int minLifeSpan;
    int maxLifeSpan;

    public String getBreedName() {
        return breedName;
    }

    public int minLifeSpan() {
        return minLifeSpan;
    }

    public int maxLifeSpan() {
        return maxLifeSpan;
    }
}
