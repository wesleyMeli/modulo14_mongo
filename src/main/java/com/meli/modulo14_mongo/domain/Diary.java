package com.meli.modulo14_mongo.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Diary {
    private String id;

    private LocalDateTime startTime;

    private LocalDateTime endingTime;

    private Dentist dentist;

    private List<Turn> turns;


    public Diary() {
    }

    public Diary(String id, LocalDateTime startTime, LocalDateTime endingTime, Dentist dentist, List<Turn> turns) {
        this.id = id;
        this.startTime = startTime;
        this.endingTime = endingTime;
        this.dentist = dentist;
        this.turns = turns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime start_time) {
        this.startTime = start_time;
    }

    public LocalDateTime getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(LocalDateTime ending_time) {
        this.endingTime = ending_time;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }
}