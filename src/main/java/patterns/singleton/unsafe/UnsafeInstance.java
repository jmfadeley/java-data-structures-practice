package patterns.singleton.unsafe;

import lombok.extern.slf4j.Slf4j;

/**
 * This approach is not thread safe. Multiple threads can still create multiple instances of this.
 * See https://stackoverflow.com/questions/54036635/what-does-it-exactly-mean-if-a-singleton-is-not-thread-safe
 * for more details.
 */
@Slf4j
public class UnsafeInstance {
    private static UnsafeInstance instance = null;
    private static int timesInitialized = 0;
    private static final String INFO = "Initialized unsafe instance info!";

    private UnsafeInstance() { }

    public static UnsafeInstance getInstance() {
        timesInitialized++;
        if(instance == null) {
            log.info(INFO);
            instance = new UnsafeInstance();
        }
        return instance;
    }

    public int getTimesInitialized() {
        return timesInitialized;
    }
}
