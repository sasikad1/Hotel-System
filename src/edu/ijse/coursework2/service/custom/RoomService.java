/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework2.service.custom;


import edu.ijse.coursework2.dto.RoomDto;
import edu.ijse.coursework2.service.SuperService;
import java.util.List;

/**
 *
 * @author sasik
 */
public interface RoomService extends SuperService{
    String saveRoom(RoomDto roomDto) throws Exception;
    
    String updateRoom(RoomDto roomDto)throws Exception;
    
    String deleteRoom(Integer id)throws Exception;
    
    RoomDto getRoom(Integer id)throws Exception;
    
    List<RoomDto> getAll() throws Exception; 
}
