package org.cse.springtute;

import java.util.List;

public interface StudentRepository {

	void saveStudent(Student stu);

	void deleteStudent(Student stu);

	Student findStudent(long regNumber);

	void updateStudent(Student stu);

	List<Student> findAllStudents();
}
