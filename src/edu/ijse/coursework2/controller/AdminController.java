/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.controller;

import edu.ijse.coursework2.dto.AdminDto;
import edu.ijse.coursework2.service.ServiceFactory;
import edu.ijse.coursework2.service.custom.AdminService;
import java.util.List;
/**
 *
 * @author sasik
 */
public class AdminController {
    
    private AdminService adminService = (AdminService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ADMIN);

    public String saveAdmin(AdminDto adminDto) throws Exception {
        return adminService.saveAdmin(adminDto);
    }
    
    public String update(AdminDto adminDto) throws Exception{
        return adminService.updateAdmin(adminDto);
    }
    
    public String delete(String adminDto) throws Exception{
        return adminService.deleteItem(adminDto);
    }
    
    public AdminDto get(String email) throws Exception{
        return adminService.getItem(email);
    }
    
    public List<AdminDto> getAll() throws Exception{
        return adminService.getAll();
    }
}
