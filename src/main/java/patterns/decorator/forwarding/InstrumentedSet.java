package patterns.decorator.forwarding;

import java.util.Collection;
import java.util.Set;

/**
 * Only tracks times added, NOT initial value. To do that, modify the constructor to adjust addCount value.
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return addCount;
    }
}
