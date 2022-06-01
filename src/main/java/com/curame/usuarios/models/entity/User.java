package com.curame.usuarios.models.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    @Column(length = 60)
    private String password;
    private Boolean enabled;
    private String firstname;
    private String lastname;
    private String email;
    @Column(name = "login_tries")
    private Integer loginTries;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_profiles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id", referencedColumnName = "id")
    )
    @JsonInclude
    private List<Profile> profiles;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    @JsonInclude
    private List<Role> roles;

}
