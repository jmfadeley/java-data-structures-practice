package patterns.factory.data.breeds;

public enum AnimalType {
    CAT("cat"),
    DOG("dog"),
    BIRD("bird");

    private String type;
    private AnimalType(String type) {
        this.type = type;
    }

    public String getAnimalType() {
        return type;
    }
}
