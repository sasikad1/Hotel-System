/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author sasik
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="customer")
public class CustomerEntity {
    
    @Id
    @Column(name="cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="cust_name", nullable = false,length = 15)
    private String name;
    
    
    @Column(name="cust_email", nullable = false,length = 20, unique=true)
    private String email;
    
    @Column(name="cust_address", nullable = false,length =50)
    private String address;
    
    @Column(name="cust_mobile", nullable = false,length = 12)
    private String mobile;

//    public CustomerEntity() {
//    }

//    public CustomerEntity(Integer id, String name, String email, String address, String mobile) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.address = address;
//        this.mobile = mobile;
//    }


    public CustomerEntity(String name, String email, String address, String mobile) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomerEntity{" + "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobile=" + mobile + '}';
//    }
    
}
