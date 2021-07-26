package com.meli.modulo14_mongo.domain;

import com.meli.modulo14_mongo.dto.DiaryDTO;
import com.meli.modulo14_mongo.dto.PatientDTO;
import com.meli.modulo14_mongo.dto.PendingTurnDTO;

import java.time.LocalDate;

public class Turn {
    private String id;

    private LocalDate days;
    private Diary diary;

    private TurnStatus turnStatus;
    private User patient;

    public Turn() {
    }

    public Turn(LocalDate days, Diary diary, TurnStatus turnStatus, User patient) {
        this.days = days;
        this.diary = diary;
        this.turnStatus = turnStatus;
        this.patient = patient;
    }

    public Turn(LocalDate days) {
        this.days = days;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDays() {
        return days;
    }

    public void setDays(LocalDate days) {
        this.days = days;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public TurnStatus getTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public PendingTurnDTO castToPendingTurnDTO() {
        DiaryDTO diaryDTO = new DiaryDTO(this.diary.getStartTime(), this.diary.getEndingTime());
        PatientDTO patientDTO =
                new PatientDTO(this.patient.getName(), this.patient.getLastName(), this.patient.getBirthDate(), this.patient.getPhone(), this.patient.getEmail());

        return new PendingTurnDTO(this.days, this.turnStatus.getName(),patientDTO, diaryDTO);

    }
}