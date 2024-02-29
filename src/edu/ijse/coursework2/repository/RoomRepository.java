/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.repository;

import edu.ijse.coursework2.entity.RoomCategoryEntity;
import edu.ijse.coursework2.entity.RoomEntity;
import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sasik
 */
public class RoomRepository {
     Session session = SessionFactoryConfiguration.getInstance().getSession();
     
     public boolean saveRoomCategory(RoomEntity entity) {
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
}
