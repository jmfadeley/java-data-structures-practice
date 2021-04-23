package patterns.decorator.wrong;

import java.util.Collection;
import java.util.HashSet;

/**
 * This illustrates the weakness of using inheritence on objects you don't control.
 * Linter is yelling at me for an equals function and therefore hashcode as well
 * but I'm going to skip it.
 * @param <E>
 */
@SuppressWarnings({"squid:S2160"})
public class BadInstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public BadInstrumentedHashSet() { }

    public BadInstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount +=c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if(!(o instanceof BadInstrumentedHashSet)) {
    //         return false;
    //     }
    // }
}
