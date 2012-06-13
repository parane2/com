package org.cse.springtute;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testunit {
	StudentManagementSystem u;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		u=new StudentManagementSystem();
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testRegisterStudent() {
		
		Student stu=new Student();
		stu.setRegNumber(12121);
		stu.setAddress("colombo");
		stu.setFirstName("parane");
		stu.setLastName("sarva");
		Student stu1=new Student();
		stu1.setRegNumber(12122);
		stu1.setAddress("america");
		stu1.setFirstName("psadl");
		stu1.setLastName("saama");
		u.registerStudent(stu);
		u.registerStudent(stu1);
	}
	@Test
	public void testListAllStudents() {
		u.listAllStudents();
	
		
	}
}
