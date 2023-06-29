package com.example.webexample1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Data
@NamedQueries(
        {
                @NamedQuery(
                        name = "Role.findByName",
                        query = "FROM Role r WHERE r.name =: name"
                )
        }
)
public class Role {
    @Id
    @Column(name="role_id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
