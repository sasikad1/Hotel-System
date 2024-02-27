/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dao;

import edu.ijse.coursework2.dao.custom.impl.AdminDaoImpl;
import edu.ijse.coursework2.dao.custom.impl.CustomerDaoImpl;
import edu.ijse.coursework2.dao.custom.impl.RoomCategoryDaoImpl;

/**
 *
 * @author sasik
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoType type){
        switch(type){
            case ADMIN:
                return new AdminDaoImpl();
            case ROOMCATEGORY:
                return new RoomCategoryDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoType{
        ADMIN, ROOMCATEGORY, CUSTOMER;
    }
}
