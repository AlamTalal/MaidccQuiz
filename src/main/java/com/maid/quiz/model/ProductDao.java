package com.maid.quiz.model;

import com.maid.quiz.types.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class ProductDao extends BaseModel {

    public ProductDao() {
        super();
    }

    public ProductDao(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public ProductDao(long id, Date creationDate, Date updatedDate, boolean isDeleted, String name, String description, Category category) {
        super(id, creationDate, updatedDate, isDeleted);
        this.name = name;
        this.description = description;
        this.category = category;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = true)
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
