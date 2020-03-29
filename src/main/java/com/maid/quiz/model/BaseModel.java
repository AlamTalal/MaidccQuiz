package com.maid.quiz.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class BaseModel {

    public BaseModel() {
    }

    public BaseModel(long id, Date creationDate, Date updatedDate, boolean isDeleted) {
        this.id = id;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
        this.isDeleted = isDeleted;
    }

    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date creationDate = Calendar.getInstance().getTime();

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    @Column(nullable = false)
    private boolean isDeleted = false;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
