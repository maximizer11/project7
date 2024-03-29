package com.example.project7.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name="session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Поле не может быть пустым!")
    @NotNull(message = "Поле не может быть пустым!")
    private String time;

    private String date;

    @ManyToOne(optional = true, cascade = CascadeType.DETACH)
    private Hall hall;

    @ManyToOne(optional = true, cascade = CascadeType.REMOVE)
    private Film film;


    public Session() {

    }

    public Session(String time, String date, Hall hall, Film film) {
        this.time = time;
        this.date = date;
        this.hall = hall;
        this.film = film;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
