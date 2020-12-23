package ro.fasttrackit.curs21.homework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;
    private Type type;
    private int year;

    public Movie(String name, Type type, int year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public Movie() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", year=" + year +
                '}';
    }
}
