# Java Data Structure Practice

A simple set of Java data structures with JUnit tests to illustrate. Target is OpenJDK 8, but 11 is fine.

## Getting Started

This is a simple Java project that uses:
- Gradle for build automation.
- JUnit 5 for testing.
- Lombok for automated constructors, getters and setters.
- Adarsh Ramamurthy's nifty Gradle test logger plugin to quickly sees results. 

## Running the tests

`./gradlew clean test`

If you're on Windows like I am, you can probably just use `gradlew`. If you want to specify a different Java build, tack `-Dorg.gradle.java.home="C:/.../OpenJDK-8"` on the end.

## License

No one cares.

## Acknowledgments

* Redbull.