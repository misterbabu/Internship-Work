package com.student.HibernateGetAndLoad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

class App 
{
    public static void main( String[] args )
    {
        /*Student stu = new Student();
        stu.setId(104);
        stu.setName("Jon");
        stu.setBranch("CS");*/
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        session.beginTransaction();
        
        Student student = (Student)session.get(Student.class, 101);
        System.out.println(student);
        
        //session.save(stu);
        session.getTransaction().commit();
        
    }
}
