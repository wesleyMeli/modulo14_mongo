package com.meli.modulo14_mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Address {

    @Id
    @Field(name="_id")
    private String id;
    private String street;
    private String district;

    public Address() {
    }

    public Address(String street, String district) {
        this.street = street;
        this.district = district;
    }

    public String getId() {
        return id;
    }

    public void setId(String id_address) {
        this.id = id_address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}