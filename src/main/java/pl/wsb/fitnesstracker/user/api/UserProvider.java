package pl.wsb.fitnesstracker.user.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserProvider {

    /**
     * Retrieves a user based on their ID.
     * If the user with given ID is not found, then {@link Optional#empty()} will be returned.
     *
     * @param userId id of the user to be searched
     * @return An {@link Optional} containing the located user, or {@link Optional#empty()} if not found
     */
    Optional<User> getUser(Long userId);

    /**
     * Retrieves a user based on their email.
     * If the user with given email is not found, then {@link Optional#empty()} will be returned.
     *
     * @param email The email of the user to be searched
     * @return An {@link Optional} containing the located user, or {@link Optional#empty()} if not found
     */
    Optional<User> getUserByEmail(String email);

    /**
     * Retrieves all users.
     *
     * @return A list containing all users.
     */
    List<User> findAllUsers();

    /**
     * Retrieves users whose email contains the given fragment (case-insensitive).
     *
     * @param email Fragment of the email to search for.
     * @return A list of matching users.
     */
    List<User> findUsersByEmail(String email);

    /**
     * Retrieves users born before the specified date.
     *
     * @param date The date to compare against.
     * @return A list of older users.
     */
    List<User> findUsersOlderThan(LocalDate date);
}