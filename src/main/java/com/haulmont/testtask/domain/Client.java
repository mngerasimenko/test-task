package com.haulmont.testtask.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "bk_client")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "client_id")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private UUID clientId;
    @Column(name = "fio")
    private String fio;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "passport")
    private String passport;
    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER, mappedBy = "client")
    private List<Bank> banks;
    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "client")
    private List<Offer> offers;

    public Client() {
    }


    public Client(UUID clientId, String fio, String telephone, String email, String passport) {
        this.clientId = clientId;
        this.fio = fio;
        this.telephone = telephone;
        this.email = email;
        this.passport = passport;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", fio='" + fio + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", passport='" + passport + '\'' +
                ", banks=" + banks +
              //  ", offers=" + offers +
                '}';
    }
}
