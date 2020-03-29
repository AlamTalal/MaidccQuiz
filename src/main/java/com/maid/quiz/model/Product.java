package com.maid.quiz.model;

import com.maid.quiz.types.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Product extends BaseModel {

    public Product() {
        super();
    }

    public Product(String name, String description, Category category, List<Sale> sales) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.sales = sales;
    }

    public Product(long id, Date creationDate, Date updatedDate, boolean isDeleted, String name, String description, Category category, List<Sale> sales) {
        super(id, creationDate, updatedDate, isDeleted);
        this.name = name;
        this.description = description;
        this.category = category;
        this.sales = sales;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = true)
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private List<Sale> sales;

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

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
