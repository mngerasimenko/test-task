package com.haulmont.testtask.domain;

import javax.persistence.*;

@Table(name = "bk_client")
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private long clientId;
    @Column(name = "fio")
    private String fio;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "passport")
    private String passport;

    public Client() {
    }


    public Client(int clientId, String fio, String telephone, String email, String passport) {
        this.clientId = clientId;
        this.fio = fio;
        this.telephone = telephone;
        this.email = email;
        this.passport = passport;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", fio='" + fio + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
