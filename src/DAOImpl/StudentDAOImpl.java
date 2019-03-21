package DAOImpl;

import java.util.ArrayList;
import java.util.Collection;

import DAO.StudentDAO;
import person.Student;
import person.consciousness.Knowledge;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public Collection<Student> getAllStudents() {
        Collection<Student> students = new ArrayList<>();
 
        students.add(new Student("Andrew Kostenko", new Knowledge(1)));
        students.add(new Student("Julia Veselkina", new Knowledge(2)));
        students.add(new Student("Maria Perechrest", new Knowledge(3)));
        students.add(new Student("Stepan Bodnar", new Knowledge(4)));
        students.add(new Student("Ira Poshyvak", new Knowledge(5)));
		return students;
	}

}
