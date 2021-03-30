package patterns.builder.lombok;

import lombok.Builder;
import lombok.Getter;

// Using Lombok's @Builder. I got to admit, this is pretty nice.
@Getter
@Builder
public class Widget {
    private final String name;
    private final int id;

    @Override
    public String toString() {
        return "Widget: "+this.name+", "+this.id;
    }
}

