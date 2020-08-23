package ru.bsc.demo.dvd_sharing.dao.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private Long id;
    private String username;
    private String password;
    private Collection<TakenItem> takenItemsById;

    @Id
    @Column(name = "ID", table = "user")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME", table = "user")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", table = "user")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<TakenItem> getTakenItemsById() {
        return takenItemsById;
    }

    public void setTakenItemsById(Collection<TakenItem> takenItemsById) {
        this.takenItemsById = takenItemsById;
    }
}
