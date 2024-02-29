/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.repository;

import edu.ijse.coursework2.entity.RoomCategoryEntity;
import edu.ijse.coursework2.entity.RoomEntity;
import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import java.util.List;
import org.hibernate.Query;
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

    public RoomEntity getRoom(Integer id) {
        RoomEntity roomEntity = session.get(RoomEntity.class, id);
        System.out.println("aaaaaQQQQQQQQQQQaaaaaaaaa"+roomEntity.getRoomId());
        return roomEntity;
    }

    public List<RoomEntity> getAllRoom() {
        String hql = "FROM RoomEntity";
        Query query = session.createQuery(hql);
        List<RoomEntity> roomEntities = query.list();
        return roomEntities;
    }
}
