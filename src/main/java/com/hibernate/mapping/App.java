package com.hibernate.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Question q1 = new Question();
        q1.setQid(101);
        q1.setQuestion("What is Java");
        
        Answers a1 = new Answers();
        a1.setAid(201);
        a1.setAnswer("Answer1 to java");
        a1.setQuestion(q1);
        
        Answers a2 = new Answers();
        a2.setAid(202);
        a2.setAnswer("Answer2 to java");
        a2.setQuestion(q1);
        
        List<Answers> list1 = new ArrayList<Answers>();
        list1.add(a1);
        list1.add(a2);
        
        q1.setAnswers(list1);
        
        Transaction tx = session.beginTransaction();
        
        session.save(q1);
        session.save(a1);
        session.save(a2);
        
        tx.commit();
        
        
    }
}
