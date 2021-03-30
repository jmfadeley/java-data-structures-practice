package patterns.builder.manual;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Using Lombok only for @Getter and @AllArgsConstructor. Keeping it otherwise immutable.
@Getter
@AllArgsConstructor
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone;
    }
}

