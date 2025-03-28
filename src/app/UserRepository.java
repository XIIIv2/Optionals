package app;

import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public Optional<User> findUserById(int id) {
        return this.users.stream()
                .filter( u -> u.getId() == id)
                .findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return this.users.stream()
                .filter( u -> u.getEmail().equals(email))
                .findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return Optional.of(this.users);
    }
}
