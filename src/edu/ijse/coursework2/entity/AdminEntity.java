/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.entity;

import org.hibernate.annotations.Entity;

/**
 *
 * @author sasik
 */
@Entity
public class AdminEntity {

    private String email;
    private String name;
    private String password;
    private String mobile;

    public AdminEntity() {
    }

    public AdminEntity(String email, String name, String password, String mobile) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "AdminEntity{" + "email=" + email + ", name=" + name + ", password=" + password + ", mobile=" + mobile + '}';
    }
    
    
}
