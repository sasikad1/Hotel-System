/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.service.custom.impl;

import edu.ijse.coursework2.dao.DaoFactory;
import edu.ijse.coursework2.dao.custom.CustomerDao;
import edu.ijse.coursework2.dto.CustomerDto;
import edu.ijse.coursework2.entity.CustomerEntity;
import edu.ijse.coursework2.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;
import edu.ijse.coursework2.repository.CustomerRepository;

/**
 *
 * @author sasik
 */
public class CustomerServiceImpl implements CustomerService {

//    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    CustomerRepository customerRepository = new CustomerRepository();

    
     @Override
    public String saveCustomer(CustomerDto dto) throws Exception {
        
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getName(),
                dto.getEmail(),
                dto.getAddress(),
                dto.getMobile());
        
                customerEntity.getName();
        if (customerRepository.saveCustomer(customerEntity)) {
            return "Successfullty Saved";
        } else {
            return "Fail";
        }
    }
    
    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(
            dto.getId(),
            dto.getName(),
            dto.getEmail(),
            dto.getAddress(),
            dto.getMobile());
        
        if(customerRepository.updateCustomer(entity)){
            return "Successfully Updated";
        }else{
            return "Fail";
        }
    }

     @Override
    public String deleteCustomer(Integer id) throws Exception {
        CustomerEntity entity = customerRepository.getCustomer(id);
        if (customerRepository.deleteCustomer(entity)) {
            return "Successfully deleted";
        }else{
            return "Fail";
        }
    }


    @Override
    public CustomerDto getCustomer(Integer id) throws Exception {
        CustomerEntity entity = customerRepository.getCustomer(id);
        return new CustomerDto(
                entity.getId(),
                entity.getName(), 
                entity.getEmail(),
                entity.getAddress(),
                entity.getMobile());
    }
    
     @Override
    public List<CustomerDto> getAll() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerRepository.getAllCustomers();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(
                    entity.getId(),
                    entity.getName(),
                    entity.getEmail(),
                    entity.getAddress(),
                    entity.getMobile()));
        }
        return customerDtos;
    }

    @Override
    public CustomerDto findCustomerByEmail(Integer id) throws Exception{
        CustomerEntity entity = customerRepository.findCustomerByEmail(id);
        return new CustomerDto(
                entity.getId(),
                entity.getName(), 
                entity.getEmail(),
                entity.getAddress(),
                entity.getMobile());
    }
    
        //Call to Dao
//    @Override
//    public String saveCustomer(CustomerDto dto) throws Exception {
//        CustomerEntity customerEntity = new CustomerEntity(dto.getName(),
//                dto.getEmail(),
//                dto.getAddress(),
//                dto.getMobile());
//
//        if (customerDao.save(customerEntity)) {
//            return "Successfullty Saved";
//        } else {
//            return "Fail";
//        }
//    }
    
    //    @Override
//    public String updateCustomer(CustomerDto dto) throws Exception {
//        CustomerEntity entity = new CustomerEntity(
//            dto.getId(),
//            dto.getName(),
//            dto.getEmail(),
//            dto.getAddress(),
//            dto.getMobile());
//        
//        if(customerDao.update(entity)){
//            return "Successfully Updated";
//        }else{
//            return "Fail";
//        }
//    }
    
    
//    @Override
//    public String deleteCustomer(String id) throws Exception {
//        if (customerDao.delete(id)) {
//            return "Successfully deleted";
//        }else{
//            return "Fail";
//        }
//    }
    
    //    @Override
//    public CustomerDto getCustomer(String id) throws Exception {
//        CustomerEntity entity = customerDao.get(id);
//        System.out.println(entity.getName());
//        return new CustomerDto(
//                entity.getId(),
//                entity.getName(), 
//                entity.getEmail(),
//                entity.getAddress(),
//                entity.getMobile());
//    }
    
         //Call to Dao
//    @Override
//    public List<CustomerDto> getAll() throws Exception {
//        List<CustomerDto> customerDtos = new ArrayList<>();
//        List<CustomerEntity> customerEntities = customerDao.getAll();
//        for (CustomerEntity entity : customerEntities) {
//            customerDtos.add(new CustomerDto(
//                    entity.getId(),
//                    entity.getName(),
//                    entity.getEmail(),
//                    entity.getAddress(),
//                    entity.getMobile()));
//        }
//        return customerDtos;
//    }
    
    
}