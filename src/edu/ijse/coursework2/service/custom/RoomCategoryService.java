/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework2.service.custom;

import edu.ijse.coursework2.dto.RoomCategoryDto;
import edu.ijse.coursework2.service.SuperService;
import java.util.List;

/**
 *
 * @author sasik
 */
public interface RoomCategoryService extends SuperService{
    
    String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception;
    
    String updateRoomCategory(RoomCategoryDto roomCategoryDto)throws Exception;
    
    String deleteRoomCategory(Integer id)throws Exception;
    
    RoomCategoryDto getRoomCategory(Integer id)throws Exception;
    
    List<RoomCategoryDto> getAll() throws Exception; 
}
