package sda.oop.model;

//klasa modelu -> determinuje strukturę danych w projekcie

import java.time.LocalDateTime;

public class User {
    private String name, lastName, email, passwd;

    private LocalDateTime registrationDate = LocalDateTime.now();
    private boolean isActive = true;

    private Role role = Role.ROLE_USER;

}
