package serviceImpl;

import java.util.Collection;

import DAO.StudentDAO;
import DAOImpl.StudentDAOImpl;
import person.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDAO = new StudentDAOImpl();
	
	@Override
	public Collection<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

}
