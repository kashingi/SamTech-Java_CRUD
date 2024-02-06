package com.mywebapp.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 15, name = "firstName")
    private String firstname;
    @Column(nullable = false, length = 15, name = "lastName")
    private String lastname;
    @Column(nullable = false, unique = true, length = 30)
    private String email;
    @Column(nullable = true, length = 20)
    private String password;
    @Column(nullable = false, unique = false, length = 20)
    private String admission;

    private boolean enabled;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admission='" + admission + '\'' +
                ", enabled=" + enabled +
                '}';
    }
    public  boolean isEnabled(){
        return enabled;
    }
}
