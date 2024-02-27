/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.controller;

import edu.ijse.coursework2.dto.CustomerDto;
import edu.ijse.coursework2.service.ServiceFactory;
import edu.ijse.coursework2.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author sasik
 */
public class CustomerController {
    private CustomerService customerService = (CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto)throws Exception{
        return customerService.saveCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(Integer id)throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto getCustomer(Integer id)throws Exception{
        return customerService.getCustomer(id);
    }
    
    public List<CustomerDto> getAllCustomer()throws Exception{
        return customerService.getAll();
    }
    
    public CustomerDto findCustomerByEmail(Integer id)throws Exception{ 
        return customerService.findCustomerByEmail(id);
    }
}
