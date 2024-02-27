/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dao.custom.impl;

import edu.ijse.coursework2.dao.CrudUtil;
import edu.ijse.coursework2.dao.custom.RoomCategoryDao;
import edu.ijse.coursework2.entity.RoomCategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class RoomCategoryDaoImpl implements RoomCategoryDao {
    
    @Override
    public boolean save(RoomCategoryEntity t) throws Exception {
        
        return CrudUtil.executeUpdate("INSERT INTO roomcategory VALUES(?,?,?)",
                null,
                t.getRoom_cate_name(),
                t.getRoom_cate_description());
    }
    
    @Override
    public boolean update(RoomCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE roomcategory SET room_cate_name=? ,room_cate_description=? WHERE room_cate_id=?", 
                t.getRoom_cate_name(),
                t.getRoom_cate_description(),
                t.getRoom_cate_id());
    }
    
    @Override
    public boolean delete(Integer id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM roomcategory WHERE room_cate_id=?", id);
    }
    
    @Override
    public RoomCategoryEntity get(Integer id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM roomcategory WHERE room_cate_id=?", id);
        while(rst.next()){
            return new RoomCategoryEntity(
                    rst.getInt("room_cate_id"),
                    rst.getString("room_cate_name"),
                    rst.getString("room_cate_description"));
        }
        return null;
    }
    
    @Override
    public List<RoomCategoryEntity> getAll() throws Exception {
        ArrayList<RoomCategoryEntity> roomCategoryEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM roomcategory");
        while(rst.next()){
            roomCategoryEntitys.add(new RoomCategoryEntity(
                rst.getInt("room_cate_id"),
                rst.getString("room_cate_name"),
                rst.getString("room_cate_description")));
        }
        return roomCategoryEntitys;
    }
    
}
