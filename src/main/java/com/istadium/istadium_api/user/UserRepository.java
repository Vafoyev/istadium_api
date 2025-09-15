package com.istadium.istadium_api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Spring Data JPA bu metod nomiga qarab, o'zi avtomatik ravishda
    // "SELECT * FROM users WHERE username = ?" degan SQL so'rovini yasab oladi.
    // Bizga hech qanday SQL kod yozish kerak emas!
    Optional<User> findByUsername(String username);

}