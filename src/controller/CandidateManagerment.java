/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Common.Library;
import java.util.ArrayList;
import java.util.function.Predicate;
import model.Candidate;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class CandidateManagerment extends Menu<String> {

    Library lib = new Library();

    static String[] choices = {"Experience", "Fresher", "Internship", "Search Candidate"};

    public CandidateManagerment() {
        super("Candidate Application", choices, "Exit");
    }

    ArrayList<Candidate> listCan = new ArrayList<>();

    public void displayA() {
        for (Candidate can : listCan) {
            System.out.println(can);
        }
    }

    public void displayB(ArrayList<Candidate> cd1) {
        for (Candidate cd : cd1) {
            System.out.println((cd.getFirstName() + " " + cd.getLastName()) + "|" + cd.getBirthDate() + "|" + cd.getAddress() + "|" + cd.getPhone() + "|" + cd.getEmail() + "|" + cd.getCadidateType());
        }
    }

    public ArrayList<Candidate> search(Predicate<Candidate> cd) {
        ArrayList<Candidate> subList = new ArrayList<>();
        for (Candidate d : listCan) {
            if (cd.test(d)) {
                subList.add(d);
            }
        }
        return subList;
    }

    @Override
    public void execute(int n) {
        Candidate cd;
        switch (n) {
            case 1: {
                int id = lib.checkID("Input your ID", listCan);
                String firstName = lib.getValue("Input your First Name:");
                String lastName = lib.getValue("Input your Last Name:");
                int birthDate = lib.checkBithday("Input birth date:");
                String add = lib.getValue("Input your address:");
                String phone = lib.checkUpdatePhone("Input your number phone (10digits):");
                String email = lib.checkEmail("Input your email (@gmail):");
                int typeCandi = 1;
                int yearOfEx = lib.checkYearEx("Input your year in Experience:");
                String proSkill = lib.getValue("Input your proSkill:");
                cd = new ExperienceCandidate(id, firstName, lastName, birthDate, add, phone, email, typeCandi, yearOfEx, proSkill);
                listCan.add(cd);
                break;

            }
            case 2: {
                int id = lib.checkID("Input your ID", listCan);
                String firstName = lib.getValue("Input your First Name:");
                String lastName = lib.getValue("Input your Last Name:");
                int birthDate = lib.checkBithday("Input birth date:");
                String add = lib.getValue("Input your address:");
                String phone = lib.checkUpdatePhone("Input your number phone (10digits):");
                String email = lib.checkEmail("Input your email (@gmail):");
                int typeCandi = 2;
                int graduateDate = Integer.parseInt(lib.getValue("Input your Graduate Date:"));
                String rank = lib.checkGraduation();
                String edu = lib.getValue("Input you education:");
                cd = new FresherCandidate(id, firstName, lastName, birthDate, add, phone, email, typeCandi, graduateDate, rank, edu);
                listCan.add(cd);
                break;
            }
            case 3: {
                int id = lib.checkID("Input your ID", listCan);
                String firstName = lib.getValue("Input your First Name:");
                String lastName = lib.getValue("Input your Last Name:");
                int birthDate = lib.checkBithday("Input birth date:");
                String add = lib.getValue("Input your address:");
                String phone = lib.checkUpdatePhone("Input your number phone (10digits):");
                String email = lib.checkEmail("Input your email (@gmail):");
                int typeCandi = 3;
                String major = lib.getValue("Inut your major");
                int semester = lib.getInt("Input your semester:");
                String universityName = lib.getValue("Input your name university:");
                cd = new InternCandidate(id, firstName, lastName, birthDate, add, phone, email, typeCandi, major, semester, universityName);
                listCan.add(cd);
                break;
            }
            case 4: {
                displayA();
                String firstName = lib.getValue("Input firstName or lastName you want to search:");
                int typeCandi = lib.getInt("Input type candidate you want to search(1./Experience, 2./Fresher , 3./Intern:");
                ArrayList<Candidate> subLL = search(kkk -> (kkk.getFirstName().equals(firstName) || kkk.getLastName().equals(firstName)) && (kkk.getCadidateType() == typeCandi));
                if (subLL.isEmpty()) {
                    System.out.println("No exist.");
                } else {
                    displayB(subLL);
                }
            }
        }
    }

}
