package com.example.recipe_web_app_spring.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
