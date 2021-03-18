package com.nagarro.demo.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student();
    	s1.fun();
    	Student s2=new Student();
    	s2.fun();
    	Student s3=new Student();
    	s3.fun();
        /*Configuration configuration = new Configuration().addAnnotatedClass(Student.class).configure();
        SessionFactory sf= configuration.buildSessionFactory();
        Session session=sf.openSession();
        Student student = new Student();
        student.setId(1);
        student.setName("divyam");
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Mahajan");
        session.beginTransaction();
        session.save(student);
        session.save(student2);
        session.getTransaction().commit();*/
    }
}
