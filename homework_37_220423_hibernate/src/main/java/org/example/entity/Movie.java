package org.example.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String movieName;
    private Integer releaseYear;
    private String language;

    public Movie(String movieName, Integer releaseYear, String language) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.language = language;
    }

}
