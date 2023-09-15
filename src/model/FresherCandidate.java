/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class FresherCandidate extends Candidate {

    private int graduationDate;
    private String graduaRank;
    private String education;

    public FresherCandidate(int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int cadidateType, int graduationDate, String graduaRank, String university) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, cadidateType);
        this.graduaRank =graduaRank;
        this.graduationDate = graduationDate; 
        this.education = education;
        
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduaRank() {
        return graduaRank;
    }

    public void setGraduaRank(String graduaRank) {
        this.graduaRank = graduaRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String university) {
        this.education = education;
    }

}
