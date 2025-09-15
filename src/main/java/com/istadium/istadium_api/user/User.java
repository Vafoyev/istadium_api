package com.istadium.istadium_api.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String fullName;

    // Bu Enum turidagi maydon foydalanuvchining rolini saqlaydi (USER yoki OWNER)
    @Enumerated(EnumType.STRING)
    private Role role;
}