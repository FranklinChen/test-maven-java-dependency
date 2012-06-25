This Maven project illustrates a problem: a dependency between Java source files results in a bad build when one file is changed but another file dependent on it is not changed and therefore not recompiled.

## Example from the `master` branch

- `$ mvn clean test` results in a passing test.
- Edit `Constants.java` to change `42` to `43`.
- `$ mvn test` recompiles `Constants.java` but not `Main.java` and therefore the test continues to pass, even though it should fail.
