package institution;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import institution.interlink.Internship;
import person.Student;

public class University {
	
	public static final int MIDDLE_LEVEL = 3;

	private String universityName;
	private Collection<Student> students;
	private Internship internship;
	
    public University(String name, Internship internship) {
        universityName = name;
        this.internship = internship;
    }

    private void addStudentsToIntership() {
        List<Student> intershipStudents =
        		students.stream().filter(s -> s.getKnowledge().getLevel() > MIDDLE_LEVEL).collect(Collectors.toList());
        intershipStudents.forEach(s -> internship.addStudentToIntership(s));
    }

	public void addStudent(Student student) {
		students.add(student);
		addStudentsToIntership();
	}

	public void addStudents(Collection<Student> students) {
		this.students = students;
		addStudentsToIntership();
	}
	
	public String getUniversityName() {
		return universityName;
	}
	
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	public Collection<Student> getStudents() {
		return students;
	}
	
	
	public Internship getInternship() {
		return internship;
	}
	
	public void setInternship(Internship internship) {
		this.internship = internship;
	}
}
