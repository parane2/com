package org.cse.springtute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		studentsDb.put(stu.getRegNumber(), stu);
	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		
		studentsDb.remove(stu.getRegNumber());
	}

	@Override
	public Student findStudent(long regNumber) {
		// TODO Auto-generated method stub
		Student s=studentsDb.get(regNumber);
		return s;
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		studentsDb.put(stu.getRegNumber(), stu);

	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>(studentsDb.values());
		return list;
	}

}
