package com.meli.modulo14_mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document("user")
public class User {

    @Id
    @Field(name="_id")
    private String id;

    private String password;

    private String userStatus;

    private String name;

    private String lastName;

    private String dni;

    private LocalDate birthDate;

    private String phone;

    private String email;

    private Address address;

    public User() {
    }

    public User(String password, String userStatus, String name, String lastName, String dni, LocalDate birthDate, String phone, String email, Address address) {
        this.password = password;
        this.userStatus = userStatus;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id_user) {
        this.id = id_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String user_status) {
        this.userStatus = user_status;
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

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birth_date) {
        this.birthDate = birth_date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address id_address) {
        this.address = id_address;
    }
}