/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service;

import edu.ijse.coursework2.service.custom.impl.AdminServiceImpl;
import edu.ijse.coursework2.service.custom.impl.CustomerServiceImpl;
import edu.ijse.coursework2.service.custom.impl.PackageServiceImpl;
import edu.ijse.coursework2.service.custom.impl.RoomCategoryServiceImpl;
import edu.ijse.coursework2.service.custom.impl.RoomServiceImpl;

/**
 *
 * @author sasik
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case ADMIN:
                return new AdminServiceImpl();
            case ROOMCATEGORY:
                return new RoomCategoryServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case PACKAGE:
                return new PackageServiceImpl();
             case ROOM:
                return new RoomServiceImpl();
            default:
                return null;
        }
    }

    public enum ServiceType {
        ADMIN, ROOMCATEGORY, CUSTOMER, PACKAGE, ROOM
    }
}
