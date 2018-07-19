package com.example.site.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Entity
@Table(name = "doctor")
public class Doctor implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long docId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String sureName;

    @NotBlank
    private Long category;

    @NotBlank
    private String specialties;

    @NotBlank
    private String workingTime;

    public Doctor() {
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docId=" + docId +
                ", firstName='" + firstName + '\'' +
                ", sureName='" + sureName + '\'' +
                ", category=" + category +
                ", specialties='" + specialties + '\'' +
                ", workingTime='" + workingTime + '\'' +
                '}';
    }
}
