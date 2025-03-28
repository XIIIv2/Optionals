package app;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository(List.of(
                new User(1, "Bob", "bob@mail.local"),
                new User(2, "Tom", "tom@email.local"),
                new User(3, "Lisa", "lisa@mail.local"),
                new User(4, "Ann", "ann@mail.local")
        ));

        repository
                .findUserById(1)
                .ifPresent(System.out::println);

        repository
                .findUserByEmail("lisa@mail.local")
                .ifPresent(System.out::println);

        repository
                .findAllUsers()
                .ifPresent(users -> {
                    System.out.println("Total number of users: " + users.size());
                });
    }
}
