/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dao.custom.impl;

import edu.ijse.coursework2.dao.CrudUtil;
import edu.ijse.coursework2.dao.custom.CustomerDao;
import edu.ijse.coursework2.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?)",
                null,
                t.getName(),
                t.getEmail(),
                t.getAddress(),
                t.getMobile());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE customer SET cust_name=?,cust_email=?,cust_address=?,cust_mobile=? WHERE cust_id=?",
                t.getName(),
                t.getEmail(),
                t.getAddress(),
                t.getMobile(),
                t.getId());
        }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE cust_id=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE cust_id=?", id);
                while(rst.next()){
                    return new CustomerEntity(
                        rst.getInt("cust_id"),
                        rst.getString("cust_name"),
                        rst.getString("cust_email"),
                        rst.getString("cust_address"),
                        rst.getString("cust_mobile"));
                }
                return null;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while(rst.next()){
            customerEntities.add(new CustomerEntity(
                rst.getInt("cust_id"),
                rst.getString("cust_name"),
                rst.getString("cust_email"),
                rst.getString("cust_Address"),
                rst.getString("cust_mobile")));
        }
        return customerEntities;
    }
    
}
