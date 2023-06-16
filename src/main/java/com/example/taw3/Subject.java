package com.example.taw3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {
    private int id;
    private String name;
    private int ectsPoints;
    private String classroom;
    private boolean hasExam;

    public Subject() {
        // Pusty konstruktor (wymagany przez Spring)
    }

    public Subject(int id, String name, int ectsPoints, String classroom, boolean hasExam)
    {
        this.id = id;
        this.name = name;
        this.ectsPoints = ectsPoints;
        this.classroom = classroom;
        this.hasExam = hasExam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEctsPoints() {
        return ectsPoints;
    }

    public void setEctsPoints(int ectsPoints) {
        this.ectsPoints = ectsPoints;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @JsonProperty("hasExam")
    public boolean hasExam() {
        return hasExam;
    }

    public void setHasExam(boolean hasExam) {
        this.hasExam = hasExam;
    }
}