/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom.impl;

import edu.ijse.coursework2.dao.DaoFactory;
import edu.ijse.coursework2.dao.custom.AdminDao;
import edu.ijse.coursework2.dto.AdminDto;
import edu.ijse.coursework2.entity.AdminEntity;
import edu.ijse.coursework2.service.custom.AdminService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao = (AdminDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ADMIN);

    @Override
    public String saveAdmin(AdminDto adminDto) throws Exception {
        AdminEntity adminEntity = new AdminEntity(
                adminDto.getEmail(),
                adminDto.getName(),
                adminDto.getPassword(),
                adminDto.getMobile());

        if (adminDao.save(adminEntity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateAdmin(AdminDto adminDto) throws Exception {
        AdminEntity adminEntity = new AdminEntity(adminDto.getEmail(),
                adminDto.getName(),
                adminDto.getPassword(),
                adminDto.getMobile());

        if (adminDao.update(adminEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteItem(String email) throws Exception {
        if (adminDao.delete(email)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public AdminDto getItem(String itemCode) throws Exception {
        AdminEntity adminEntity = adminDao.get(itemCode);
        return new AdminDto(adminEntity.getEmail(),
                adminEntity.getName(),
                adminEntity.getPassword(),
                adminEntity.getMobile());
    }

    @Override
    public List<AdminDto> getAll() throws Exception {
        List<AdminDto> adminDtos = new ArrayList<>();
        List<AdminEntity> adminEntities = adminDao.getAll();
        
        for(AdminEntity e: adminEntities){
            adminDtos.add(new AdminDto(e.getEmail(),
                    e.getName(),
                    e.getPassword(),
                    e.getMobile()));
        }
        return adminDtos;
    }

}
