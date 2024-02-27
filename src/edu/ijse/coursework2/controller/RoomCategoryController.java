/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.controller;

import edu.ijse.coursework2.dto.RoomCategoryDto;
import edu.ijse.coursework2.service.ServiceFactory;
import edu.ijse.coursework2.service.custom.RoomCategoryService;
import java.util.List;

/**
 *
 * @author sasik
 */
public class RoomCategoryController {
    
    private RoomCategoryService roomCategoryService = (RoomCategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMCATEGORY);
            
    public String saveRoomCategory(RoomCategoryDto roomCategoryDto)throws Exception{
        return roomCategoryService.saveRoomCategory(roomCategoryDto);
    }
    
    public String update(RoomCategoryDto roomCategoryDto)throws Exception{
        return roomCategoryService.updateRoomCategory(roomCategoryDto);
    }
    
    public String delete(Integer id)throws Exception{
        return roomCategoryService.deleteRoomCategory(id);
    }
    
    public RoomCategoryDto get(Integer id)throws Exception{
        return roomCategoryService.getRoomCategory(id);
    }
    
    public List<RoomCategoryDto> getAll()throws Exception{
        return roomCategoryService.getAll();
    }
}
