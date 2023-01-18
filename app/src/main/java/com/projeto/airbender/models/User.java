package com.projeto.airbender.models;

public class User {
    private int id;
    private String username;
    private String fName;
    private String surname;
    private String birthdate;
    private String phone;
    private String nif;
    private enum gender {M,F};
    private String accCreationDate;
    private boolean application;
    private double balance;


    public User(String username, String fName, String surname, String birthdate, String phone, String nif, String accCreationDate, boolean application, double balance) {
        this.username = username;
        this.fName = fName;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.nif = nif;
        this.accCreationDate = accCreationDate;
        this.application = application;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAccCreationDate() {
        return accCreationDate;
    }

    public void setAccCreationDate(String accCreationDate) {
        this.accCreationDate = accCreationDate;
    }

    public boolean isApplication() {
        return application;
    }

    public void setApplication(boolean application) {
        this.application = application;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
