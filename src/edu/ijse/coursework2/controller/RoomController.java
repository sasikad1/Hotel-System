/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.controller;

import edu.ijse.coursework2.dto.RoomDto;
import edu.ijse.coursework2.service.ServiceFactory;
import edu.ijse.coursework2.service.custom.RoomService;

/**
 *
 * @author sasik
 */
public class RoomController {
     private RoomService roomService = (RoomService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);
            
    public String saveRoom(RoomDto dto)throws Exception{
        return roomService.saveRoom(dto);
    }
}
