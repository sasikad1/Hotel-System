/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.repository;

import edu.ijse.coursework2.entity.PackageEntity;
import edu.ijse.coursework2.entity.RoomCategoryEntity;
import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sasik
 */
public class RoomCategoryRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public boolean saveRoomCategory(RoomCategoryEntity entity) {
        Transaction transaction = session.beginTransaction();
        System.out.println("ssssssssssssss"+entity.getRoom_cate_description());
        try {
            session.save(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public RoomCategoryEntity getRoomCategory(Integer id) {
        RoomCategoryEntity roomCategoryEntity = session.get(RoomCategoryEntity.class, id);
        return roomCategoryEntity;
    }

    public boolean updateRoomCategory(RoomCategoryEntity entity) {
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

    public boolean deleteRoomCategory(RoomCategoryEntity entity) {
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

    public List<RoomCategoryEntity> getAllRoomCategory() {
        String hql = "FROM RoomCategoryEntity";
        Query query = session.createQuery(hql);
        List<RoomCategoryEntity> roomCategoryEntities = query.list();
        return roomCategoryEntities;
    }
}
