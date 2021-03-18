package com.haulmont.testtask;

public class Client {
    private String surName;
    private String foreName;
    private String patronymic;
    private String telephone;
    private String email;
    private String passport;

    public Client(String surName, String foreName, String patronymic, String telephone, String email, String passport) {
        this.surName = surName;
        this.foreName = foreName;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.email = email;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return surName + " " + foreName + " " + patronymic + " " + passport;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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
}
