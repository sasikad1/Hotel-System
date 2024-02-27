/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.utill;

import edu.ijse.coursework2.entity.CustomerEntity;
import edu.ijse.coursework2.entity.PackageEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author sasik
 */
public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;
    
    private SessionFactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(PackageEntity.class);
        sessionFactory=configuration.buildSessionFactory();
    }
    
    public static SessionFactoryConfiguration getInstance(){
        if(sessionFactoryConfiguration==null){
            sessionFactoryConfiguration = new SessionFactoryConfiguration();
        }
        return sessionFactoryConfiguration;
    }
    
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
