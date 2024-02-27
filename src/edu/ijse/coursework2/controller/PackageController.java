/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.controller;

import edu.ijse.coursework2.dto.CustomerDto;
import edu.ijse.coursework2.dto.PackageDto;
import edu.ijse.coursework2.service.ServiceFactory;
import edu.ijse.coursework2.service.custom.AdminService;
import edu.ijse.coursework2.service.custom.PackageService;
import java.util.List;

/**
 *
 * @author sasik
 */
public class PackageController {
    private PackageService packageService = (PackageService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PACKAGE);

    public String savePackage(PackageDto dto) throws Exception{
        return packageService.savePackage(dto);
    }
    
    public String deletePackage(Integer id) throws Exception{
        return packageService.deletePackage(id);
    }
    
    public String updatePackage(PackageDto dto) throws Exception{
        return packageService.updatePackage(dto);
    }
    
    public PackageDto getPackage(Integer id)throws Exception{
        return packageService.getPackage(id);
    }
    
     public List<PackageDto> getAllPackage()throws Exception{
        return packageService.getAll();
    }
     
}
