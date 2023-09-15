/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class ExperienceCandidate extends Candidate {

    private int yearOfExper;
    private String proSkill;

    public ExperienceCandidate(int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int cadidateType, int yearOfExper, String proSkill) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, cadidateType);
        this.proSkill = proSkill;
        this.yearOfExper = yearOfExper;

    }

    public int getYearOfExper() {
        return yearOfExper;
    }

    public void setYearOfExper(int yearOfExper) {
        this.yearOfExper = yearOfExper;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
    
}
