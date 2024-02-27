/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom.impl;

import edu.ijse.coursework2.dao.DaoFactory;
import edu.ijse.coursework2.dao.custom.RoomCategoryDao;
import edu.ijse.coursework2.dto.RoomCategoryDto;
import edu.ijse.coursework2.entity.RoomCategoryEntity;
import edu.ijse.coursework2.service.custom.RoomCategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class RoomCategoryServiceImpl implements RoomCategoryService {

    private RoomCategoryDao roomCategoryDao = (RoomCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMCATEGORY);

    @Override
    public String saveRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(
                roomCategoryDto.getRoom_cate_name(),
                roomCategoryDto.getRoom_cate_description());
        if (roomCategoryDao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Faild";
        }

    }

    @Override
    public String updateRoomCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(
                roomCategoryDto.getRoom_cate_id(),
                roomCategoryDto.getRoom_cate_name(),
                roomCategoryDto.getRoom_cate_description());

        if (roomCategoryDao.update(entity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteRoomCategory(Integer id) throws Exception {
        if (roomCategoryDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public RoomCategoryDto getRoomCategory(Integer id) throws Exception {
        RoomCategoryEntity entity = roomCategoryDao.get(id);
        return new RoomCategoryDto(entity.getRoom_cate_id(),
                entity.getRoom_cate_name(),
                entity.getRoom_cate_description());
    }

    @Override
    public List<RoomCategoryDto> getAll() throws Exception {
        List<RoomCategoryDto> roomCategoryDtos = new ArrayList<>();
        List<RoomCategoryEntity> roomCategoryEntitys = roomCategoryDao.getAll();

        for (RoomCategoryEntity e : roomCategoryEntitys) {
            roomCategoryDtos.add(new RoomCategoryDto(
                    e.getRoom_cate_id(),
                    e.getRoom_cate_name(),
                    e.getRoom_cate_description()));
        }
        return roomCategoryDtos;
    }

}
