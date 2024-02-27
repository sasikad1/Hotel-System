/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom.impl;

import edu.ijse.coursework2.dao.DaoFactory;
import edu.ijse.coursework2.dao.custom.CustomerDao;
import edu.ijse.coursework2.dto.CustomerDto;
import edu.ijse.coursework2.dto.PackageDto;
import edu.ijse.coursework2.entity.CustomerEntity;
import edu.ijse.coursework2.entity.PackageEntity;
import edu.ijse.coursework2.repository.CustomerRepository;
import edu.ijse.coursework2.repository.PackageRepository;
import edu.ijse.coursework2.service.custom.PackageService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasik
 */
public class PackageServiceImpl implements PackageService {

    PackageRepository packageRepository = new PackageRepository();

    @Override
    public String savePackage(PackageDto packageDto) throws Exception {
        PackageEntity entity = new PackageEntity(
                packageDto.getPack_name(),
                packageDto.getPack_amount()
        );

        if (packageRepository.saveCustomer(entity)) {
            return "Successfullty Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updatePackage(PackageDto dto) throws Exception {
        PackageEntity entity = new PackageEntity(
                dto.getPack_id(),
                dto.getPack_name(),
                dto.getPack_amount());

        if (packageRepository.updatePackage(entity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deletePackage(Integer id) throws Exception {
        PackageEntity entity = packageRepository.getPackage(id);
        if (packageRepository.deletePackage(entity)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public PackageDto getPackage(Integer id) throws Exception {
        PackageEntity entity = packageRepository.getPackage(id);
        return new PackageDto(
                entity.getPack_id(),
                entity.getPack_name(),
                entity.getPack_amount()
        );
    }

    @Override
    public List<PackageDto> getAll() throws Exception {
        List<PackageDto> packageDtos = new ArrayList<>();
        List<PackageEntity> packageEntities = packageRepository.getAllPackage();
        for (PackageEntity entity : packageEntities) {
            packageDtos.add(new PackageDto(
                    entity.getPack_id(),
                    entity.getPack_name(),
                    entity.getPack_amount()));
        }
        return packageDtos;
    }

    
}
