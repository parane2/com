package org.cse.springtute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;



public class SmsStarter {

	public static void main(String[] args) {
		StudentManagementSystem sms=new StudentManagementSystem();
		//load the bean from spring
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		sms=(StudentManagementSystem)factory.getBean("manage");
		//t.Draw();
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
	sms.listAllStudents();
	sms.registerStudent(stu);
	sms.registerStudent(stu1);
sms.listAllStudents();
	}
}
