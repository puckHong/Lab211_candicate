/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class InternCandidate extends Candidate {

    private String major;
    private int semester;
    private String university;

    public InternCandidate(int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int cadidateType, String major, int semester, String university) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, cadidateType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }
    

}
