package com.curame.usuarios.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="profiles")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true,length = 100)
    private String profileName;
    @ManyToMany( fetch = FetchType.LAZY,mappedBy = "profiles")
    @JsonIgnore
    private List<User> users;
}
