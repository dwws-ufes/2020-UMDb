package com.ufes.inf.dwws.umdb.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy="genres", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Movie> movieList;

    public Genre(String name){
        this.name = name;
    }
    public Genre(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovieList() { return movieList; }
    public void setMovieList(List<Movie> movieList) { this.movieList = movieList; }
}
