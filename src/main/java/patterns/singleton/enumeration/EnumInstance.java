package patterns.singleton.enumeration;

import lombok.Getter;
import lombok.Setter;

/**
* Behold! Thread safety by mere use of enums instead of classes.
* Note that Lombok annotations don't work on enums, but do work on individual fields.
* The "info" field is for demonstration purposes only: changing it can have
* adverse effects between JUnit tests because only one instance is ever created. It is
* not "recreated" between tests. That is why mutable states can be dangerous. 
*/
public enum EnumInstance {
    INSTANCE("My twin was delicious");

    @Getter
    @Setter // Mutable properties of a singleton are dangerous. Demo purposes only.
    private volatile String info; // Volatile makes it access from main memory. 

    private EnumInstance(String info) {
        this.info = info;
    }

    public EnumInstance getInstance() {
        return INSTANCE;
    }
}
