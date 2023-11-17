package org.example.entity;

import jakarta.persistence.*;
import org.example.utils.Status;
import org.example.utils.Category;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.example.utils.Constants.SCHEMA;
import static org.example.utils.Constants.TABLE_COMPLETE;

@Entity
@Table(schema = SCHEMA, name = TABLE_COMPLETE)
public class CompleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private UserEntity user_id;

    private String reason;
    private Boolean permision;
    @Enumerated
    private Category user_category;
    private LocalTime localLeftTime;
    private LocalDate localDate;
    private LocalTime localCameTime;
    @Enumerated
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser_id() {
        return user_id;
    }

    public void setUser_id(UserEntity user_id) {
        this.user_id = user_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getPermision() {
        return permision;
    }

    public void setPermision(Boolean permision) {
        this.permision = permision;
    }

    public Category getUser_category() {
        return user_category;
    }

    public void setUser_category(Category user_category) {
        this.user_category = user_category;
    }

    public LocalTime getLocalLeftTime() {
        return localLeftTime;
    }

    public void setLocalLeftTime(LocalTime localLeftTime) {
        this.localLeftTime = localLeftTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalCameTime() {
        return localCameTime;
    }

    public void setLocalCameTime(LocalTime localCameTime) {
        this.localCameTime = localCameTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CompleteEntity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", reason='" + reason + '\'' +
                ", permision=" + permision +
                ", user_category=" + user_category +
                ", localLeftTime=" + localLeftTime +
                ", localDate=" + localDate +
                ", localCameTime=" + localCameTime +
                ", status=" + status +
                '}';
    }
}
