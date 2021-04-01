package patterns.singleton.synced;

import lombok.Getter;
import lombok.Setter;

/**
 * This used the synchronized keyword to ensure a lock is placed on the method.
 * Other objects cannot access this block until the prior process finishes. 
 * Important factor: Synced object instances (as in, objects) can only allow one
 * process per instance (and there can be multiple instances). Synced statics 
 * belong to the class, and since only one of those can exist in the JVM at a time,
 * performance can be slow if multiple processes need it.
 * See https://www.baeldung.com/java-synchronized for more.
 */
public class SyncedInstance {
    private static SyncedInstance instance = null;
    private static int timesInitialized = 0;

    @Getter
    @Setter
    private volatile String info = "My twin was delicious"; // Volatile makes it access from main memory. 

    private SyncedInstance() { }

    public static synchronized SyncedInstance getInstance() {
        if(instance == null) {
            instance = new SyncedInstance();
        }
        return instance;
    }

    public int getTimesInitialized() {
        return timesInitialized;
    }
}
