package pl.wsb.fitnesstracker.user.internal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring sam wygeneruje zapytanie SQL: SELECT * FROM users WHERE email = ?
    Optional<User> findByEmail(String email);

    // Metoda wymagana pod zadanie w Postmanie - szuka fragmentu maila bez względu na wielkość liter
    List<User> findByEmailContainingIgnoreCase(String email);

}