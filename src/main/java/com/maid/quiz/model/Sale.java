package com.maid.quiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@EnableJpaAuditing
@Audited
public class Sale extends BaseModel {

    private long total;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotAudited
    private Client client;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "sales_products",
            joinColumns = @JoinColumn(
                    name = "sale_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id", referencedColumnName = "id"))
    @JsonIgnore
    @NotAudited
    private List<Product> products;

    public Sale() {
        super();
    }

    public Sale(long total, Client client, List<Product> products) {
        this.total = total;
        this.client = client;
        this.products = products;
    }

    public Sale(long id, Date creationDate, Date updatedDate, boolean isDeleted, long total, Client client, List<Product> products) {
        super(id, creationDate, updatedDate, isDeleted);
        this.total = total;
        this.client = client;
        this.products = products;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
