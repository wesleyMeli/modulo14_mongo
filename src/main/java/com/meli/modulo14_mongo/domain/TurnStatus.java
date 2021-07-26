package com.meli.modulo14_mongo.domain;

public class TurnStatus {

    private String id;
    private String name;
    private String description;

    public TurnStatus() {
    }

    public TurnStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id_turn_status) {
        this.id = id_turn_status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}