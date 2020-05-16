package sda.oop.model;

//klasa modelu -> determinuje strukturę danych w projekcie

import java.time.LocalDateTime;

public class User {
    private String name, lastName, email, passwd;

    private LocalDateTime registrationDate = LocalDateTime.now();
    private boolean status = true;

    private Role role = Role.ROLE_USER;

    public User(String name, String lastName, String email, String passwd) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                ", role=" + role +
                '}';
    }
}
