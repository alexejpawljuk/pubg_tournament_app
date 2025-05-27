package org.alexej.demo.service;

import org.alexej.demo.repository.User;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of(
                new User(1L, "John", "john@email.org", LocalDate.of(1989, 12, 10), 35),
                new User(2L, "Olga", "olga@email.org", LocalDate.of(1984, 9, 28), 40),
                new User(3L, "Maik", "maik@email.org", LocalDate.of(1990, 1, 25), 34)
        );
    }
}
