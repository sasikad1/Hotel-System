/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.repository;

import edu.ijse.coursework2.entity.CustomerEntity;
import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.sql.ResultSet;

/**
 *
 * @author sasik
 */
public class CustomerRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public boolean saveCustomer(CustomerEntity entity) {
        Transaction transaction = session.beginTransaction();
        try {
//            Boolean id = (Boolean)session.save(entity);
            session.save(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public List<CustomerEntity> getAllCustomers() {
        String hql = "FROM CustomerEntity";
        Query query = session.createQuery(hql);
        List<CustomerEntity> customerEntites = query.list();
        return customerEntites;
    }

    public CustomerEntity getCustomer(Integer id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    public boolean deleteCustomer(CustomerEntity entity) throws RuntimeException {
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public boolean updateCustomer(CustomerEntity entity) throws RuntimeException {
        Transaction transaction = session.beginTransaction();
        try {
            CustomerEntity yourEntity = session.get(CustomerEntity.class, entity.getId());
    
            session.merge(yourEntity);
            return true;
        } catch (Exception e) {
            transaction.rollback();
//            throw new RuntimeException("Error at update " + entity.getId());
            return false;
        }
    }

    public CustomerEntity findCustomerByEmail(Integer id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }
}
