package com.maid.quiz.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Client extends BaseModel {

    private String name;

    private String lastName;

    private long mobile;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Sale> sales;


    public Client() {
        super();
    }

    public Client(String name, String lastName, long mobile, List<Sale> sales) {
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
        this.sales = sales;
    }

    public Client(long id, Date creationDate, Date updatedDate, boolean isDeleted, String name, String lastName, long mobile, List<Sale> sales) {
        super(id, creationDate, updatedDate, isDeleted);
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
