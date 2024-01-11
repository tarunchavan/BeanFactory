package com.spring_beanfactory.Bean_Factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApplication {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
	    Student student = (Student) factory.getBean("student");

	    System.out.println(student);;
	}

}



