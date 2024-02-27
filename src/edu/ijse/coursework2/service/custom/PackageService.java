/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom;

import edu.ijse.coursework2.dto.PackageDto;
import edu.ijse.coursework2.service.SuperService;
import java.util.List;

/**
 *
 * @author sasik
 */
public interface PackageService extends SuperService{
    
    String savePackage(PackageDto packageDto) throws Exception;
    
    String updatePackage(PackageDto packageDto)throws Exception;
    
    String deletePackage(Integer id)throws Exception;
    
    PackageDto getPackage(Integer id)throws Exception;
    
    List<PackageDto> getAll() throws Exception;
}
