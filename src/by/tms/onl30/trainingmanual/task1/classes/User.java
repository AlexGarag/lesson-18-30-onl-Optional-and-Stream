package by.tms.onl30.trainingmanual.task1.classes;

import java.util.Optional;

public class User {
    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}