package ru.bsc.demo.dvd_sharing.dao.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Disk {
    private Long id;
    private String name;
    private String description;
    private Collection<TakenItem> takenItemsById;

    @Id
    @Column(name = "ID", table = "disk")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", table = "disk")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIPTION", table = "disk")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return id == disk.id &&
                Objects.equals(name, disk.name) &&
                Objects.equals(description, disk.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @OneToMany(mappedBy = "diskByDiskId")
    public Collection<TakenItem> getTakenItemsById() {
        return takenItemsById;
    }

    public void setTakenItemsById(Collection<TakenItem> takenItemsById) {
        this.takenItemsById = takenItemsById;
    }
}
