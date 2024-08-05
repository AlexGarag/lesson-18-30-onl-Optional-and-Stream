package by.tms.onl30.trainingmanual.task1.entities;

import java.util.*;

public class UserStorage {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> getUser(String name) {
        for (User user : users) {
            if (user.getName().orElse("").equals(name)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public List<User> getUserStorage() {
        return new ArrayList<>(users);
    }
}

