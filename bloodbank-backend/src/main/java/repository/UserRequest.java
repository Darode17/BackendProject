package repository;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserRequest extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
