/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sasik
 */

public class PackageDto {
    private Integer pack_id;
    
    private String pack_name;
    
    private String pack_amount;

    public PackageDto() {
    }

    public PackageDto(Integer pack_id, String pack_name, String pack_amount) {
        this.pack_id = pack_id;
        this.pack_name = pack_name;
        this.pack_amount = pack_amount;
    }

    public PackageDto(String pack_name, String pack_amount) {
        this.pack_name = pack_name;
        this.pack_amount = pack_amount;
    }
      
    public Integer getPack_id() {
        return pack_id;
    }

    public String getPack_name() {
        return pack_name;
    }

    public String getPack_amount() {
        return pack_amount;
    }

    public void setPack_id(Integer pack_id) {
        this.pack_id = pack_id;
    }

    public void setPack_name(String pack_name) {
        this.pack_name = pack_name;
    }

    public void setPack_amount(String pack_amount) {
        this.pack_amount = pack_amount;
    }

    @Override
    public String toString() {
        return "PackageDto{" + "pack_id=" + pack_id + ", pack_name=" + pack_name + ", pack_amount=" + pack_amount + '}';
    }
    
    
}
