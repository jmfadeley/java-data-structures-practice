package patterns.builder.manual;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Using Lombok only for @Getter and @AllArgsConstructor. Keeping it otherwise immutable.
// This uses an inner class for its builder. Personally, UserBuilder's as a separate file.
@Getter
@AllArgsConstructor
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone;
    }

    public static class Builder
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

