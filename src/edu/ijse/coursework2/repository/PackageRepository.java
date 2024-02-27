/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.repository;

import edu.ijse.coursework2.entity.CustomerEntity;
import edu.ijse.coursework2.entity.PackageEntity;
import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sasik
 */
public class PackageRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public boolean saveCustomer(PackageEntity entity) {
        Transaction transaction = session.beginTransaction();
        try {
            session.save(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }
    
    public PackageEntity getPackage(Integer id) {
        PackageEntity packageEntity = session.get(PackageEntity.class, id);
        return packageEntity;
    }
    
    public boolean updatePackage(PackageEntity entity) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }
    
    public boolean deletePackage(PackageEntity entity) {
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
    
    public List<PackageEntity> getAllPackage() {
        String hql = "FROM PackageEntity";
        Query query = session.createQuery(hql);
        List<PackageEntity> PackageEntities = query.list();
        return PackageEntities;
    }
}
