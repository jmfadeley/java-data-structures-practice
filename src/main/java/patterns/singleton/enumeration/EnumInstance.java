package patterns.singleton.enumeration;

import lombok.Getter;
import lombok.Setter;

/**
* Behold! Thread safety by mere use of enums instead of classes.
* Note that Lombok annotations don't work on enums, but do work on individual fields.
*/
public enum EnumInstance {
    INSTANCE("My twin was delicious");

    @Getter
    @Setter
    private volatile String info; // Volatile makes it access from main memory. 

    private EnumInstance(String info) {
        this.info = info;
    }

    public EnumInstance getInstance() {
        return INSTANCE;
    }
}
