package institution.interlink;

import java.util.ArrayList;
import java.util.Collection;

import person.Student;

public class Internship {
	
	private String intershipName;
	private Collection<Student> intershipStudents;
	
    public Internship(String name) {
        intershipName = name;
        intershipStudents = new ArrayList<Student>();
    }

    public void addStudentToIntership(Student student) {
    	intershipStudents.add(student);	
    }

    public String getStudents() {
        return intershipStudents.toString();
    }
}
