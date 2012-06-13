package org.cse.springtute;

public class StudentManagementSystem {

	private StudentRepository repo=new SimpleStudentRepository();

	public void listAllStudents() {
		for(Student i:repo.findAllStudents())
	System.out.println(i.getFirstName());
	}

	public void registerStudent(Student stu){

		
		repo.saveStudent(stu);//Save the new student using repository
	}
}

