package ru.bsc.demo.dvd_sharing.dao.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "taken_item", schema = "dvd_sharing")
public class TakenItem {
    private Long id;
    private Long userId;
    private Long diskId;
    private User userByUserId;
    private Disk diskByDiskId;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "DISK_ID")
    public Long getDiskId() {
        return diskId;
    }

    public void setDiskId(Long diskId) {
        this.diskId = diskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakenItem takenItem = (TakenItem) o;
        return id == takenItem.id &&
                userId == takenItem.userId &&
                Objects.equals(diskId, takenItem.diskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, diskId);
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false, table = "taken_item", insertable = false, updatable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "DISK_ID", referencedColumnName = "ID", table = "taken_item", insertable = false, updatable = false)
    public Disk getDiskByDiskId() {
        return diskByDiskId;
    }

    public void setDiskByDiskId(Disk diskByDiskId) {
        this.diskByDiskId = diskByDiskId;
    }
}
