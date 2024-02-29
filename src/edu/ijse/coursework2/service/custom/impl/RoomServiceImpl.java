/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom.impl;

import edu.ijse.coursework2.dto.RoomCategoryDto;
import edu.ijse.coursework2.dto.RoomDto;
import edu.ijse.coursework2.entity.RoomCategoryEntity;
import edu.ijse.coursework2.entity.RoomEntity;
import edu.ijse.coursework2.repository.RoomRepository;
import edu.ijse.coursework2.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class RoomServiceImpl implements RoomService{
     RoomRepository roomRepository = new RoomRepository();
    
    @Override
    public String saveRoom(RoomDto dto) throws Exception {
        RoomEntity entity = new RoomEntity(
                dto.getRoomCategory(),
                dto.getRoomDescription());
        if (roomRepository.saveRoomCategory(entity)) {
            return "Successfully Saved";
        } else {
            return "Faild";
        }
    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteRoom(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RoomDto getRoom(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
         List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntitys = roomRepository.getAllRoom();

        for (RoomEntity e : roomEntitys) {
            roomDtos.add(new RoomDto(
                    e.getRoomCategory(),
                    e.getRoomDescription()));
        }
        return roomDtos;}
}
