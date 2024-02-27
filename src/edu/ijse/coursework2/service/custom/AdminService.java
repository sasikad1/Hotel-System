/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework2.service.custom;

import edu.ijse.coursework2.dto.AdminDto;
import edu.ijse.coursework2.service.SuperService;
import java.util.List;

/**
 *
 * @author sasik
 */
public interface AdminService extends SuperService{
    
    String saveAdmin(AdminDto adminDto)throws Exception;
    
    String updateAdmin(AdminDto adminDto)throws Exception;
    
    String deleteItem(String id)throws Exception;
    
    AdminDto getItem(String id)throws Exception;
    
    List<AdminDto> getAll() throws Exception;
}
