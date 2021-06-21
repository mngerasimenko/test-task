package com.haulmont.testtask.domain;


import javax.persistence.*;
import java.util.List;

@Table(name = "bk_credit")
@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private Long creditId;
    @Column(name = "limit")
    private double limit;
    @Column(name = "percent")
    private double percent;
    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "credit")
    private List<Bank> banks;


    public Credit() {
    }

    public Credit(double limit, double percent) {
        this.limit = limit;
        this.percent = percent;
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }
}
