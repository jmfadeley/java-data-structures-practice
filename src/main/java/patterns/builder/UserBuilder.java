package patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;

    // You start here.
    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAge(String age) {
        this.age = Integer.parseInt(age);
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User build() {
        User user = new User(firstName, lastName, age, phone);
        validateUser(user);
        return user;
    }

    public void validateUser(User user) {
        log.info("Not really validating anything right now. So like...");
        log.info(user.toString());
    }
}
