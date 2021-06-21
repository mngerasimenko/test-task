package com.haulmont.testtask.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "bk_schedule")
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long scheduleId;
    private LocalDateTime date;
    private Double paymentAm;
    private Double bodyAm;
    private Double percentAm;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getPaymentAm() {
        return paymentAm;
    }

    public void setPaymentAm(Double paymentAm) {
        this.paymentAm = paymentAm;
    }

    public Double getBodyAm() {
        return bodyAm;
    }

    public void setBodyAm(Double bodyAm) {
        this.bodyAm = bodyAm;
    }

    public Double getPercentAm() {
        return percentAm;
    }

    public void setPercentAm(Double percentAm) {
        this.percentAm = percentAm;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}
