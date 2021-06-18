package com.haulmont.testtask.domain;


import javax.persistence.*;

@Table(name = "bk_credit")
@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private long creditId;
    @Column(name = "limit")
    private double limit;
    @Column(name = "percent")
    private double percent;

    public Credit() {
    }

    public Credit(double limit, double percent) {
        this.limit = limit;
        this.percent = percent;
    }

    public long getCreditId() {
        return creditId;
    }

    public void setCreditId(long creditId) {
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
}
