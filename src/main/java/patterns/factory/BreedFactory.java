package patterns.factory;

/**
 * Best explained, this is factory and NOT abstract factory. From what I gather,
 * abstract uses composition while this uses inheritance. So while easier to
 * understand, factory may not be quite as useful.
 */
public class BreedFactory {
    private static final String BEAGLE = "Beagle";
    private static final String GERMAN_SHEPHERD = "German Shepherd";
    private static final String GREAT_DATE = "Great Dane";
    
    private BreedFactory() { }

    public static Breed create(String breedType) {
        if (BEAGLE.equalsIgnoreCase(breedType)) {
            return new Beagle();
        } else if (GERMAN_SHEPHERD.equalsIgnoreCase(breedType)) {
            return new GermanShepherd();
        } else if (GREAT_DATE.equalsIgnoreCase(breedType)) {
            return new GreatDane();
        }

        return null;
    }
}
