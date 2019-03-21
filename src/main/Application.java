package main;

import institution.University;
import institution.interlink.Internship;
import serviceImpl.StudentServiceImpl;

public class Application {
    public static void main(String[] args) {
    	
        University university = new University("CH.U.I.", new Internship("Interlink"));
        university.addStudents(new StudentServiceImpl().getAllStudents());
      
        System.out.println("List of internship's students:");
        System.out.println(university.getInternship().getStudents());
    }
}
