package com.meli.modulo14_mongo.domain;

import java.util.List;

//@Document("user")
public class Dentist extends User {

    private String codeMp;

    List<Diary> diaries;

    public Dentist() {
    }

    public Dentist(String codeMp, List<Diary> diaries) {
        this.codeMp = codeMp;
        this.diaries = diaries;
    }

    public Dentist(String codeMp) {
        this.codeMp = codeMp;
    }

    public String getCodeMp() {
        return codeMp;
    }

    public void setCodeMp(String code_mp) {
        this.codeMp = code_mp;
    }

    public List<Diary> getDiaries() {
        return diaries;
    }

    public void setDiaries(List<Diary> diaries) {
        this.diaries = diaries;
    }
}