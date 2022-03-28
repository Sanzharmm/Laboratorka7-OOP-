package com.example.UTills;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateOfUtil {
    private static final SessionFactory sessionFactory = init();
    private static SessionFactory init(){
        try{
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null)
            init();
        return sessionFactory;}
    public static void shutdown(){
        getSessionFactory().close();
    }
}
