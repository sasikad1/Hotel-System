/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dao.custom.impl;

import edu.ijse.coursework2.dao.CrudUtil;
import edu.ijse.coursework2.dao.custom.AdminDao;
import edu.ijse.coursework2.entity.AdminEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class AdminDaoImpl implements AdminDao {

    @Override
    public boolean save(AdminEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Admin VALUES(?,?,?,?)",
                t.getEmail(),
                t.getName(),
                t.getPassword(),
                t.getMobile());
    }

    @Override
    public boolean update(AdminEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE admin SET name=?, password=?, mobile=? WHERE email=?",
                t.getName(),
                t.getPassword(),
                t.getMobile(),
                t.getEmail());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM admin WHERE email=?", id);
    }

    @Override
    public AdminEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM admin WHERE email=?", id);
        while (rst.next()) {
            return new AdminEntity(rst.getString("email"),
                    rst.getString("name"),
                    rst.getString("password"),
                    rst.getString("mobile"));
        }
        return null;
    }

    @Override
    public List<AdminEntity> getAll() throws Exception {
        ArrayList<AdminEntity> adminEntity = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM admin");
        while (rst.next()) {
            adminEntity.add(new AdminEntity(rst.getString("email"),
                    rst.getString("name"),
                    rst.getString("password"),
                    rst.getString("mobile")));
        }
        return adminEntity;
    }

}
