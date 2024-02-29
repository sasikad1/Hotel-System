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
public class RoomCategoryEntity {
    private Integer room_cate_id;
    private String room_cate_name;
    private String room_cate_description;
    private Integer room_cate_amount;

    public RoomCategoryEntity() {
    }

    public RoomCategoryEntity(Integer room_cate_id, String room_cate_name, String room_cate_description, Integer room_cate_amount) {
        this.room_cate_id = room_cate_id;
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
        this.room_cate_amount = room_cate_amount;
    }

    public RoomCategoryEntity(String room_cate_name, String room_cate_description, Integer room_cate_amount) {
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
        this.room_cate_amount = room_cate_amount;
    }

    public Integer getRoom_cate_id() {
        return room_cate_id;
    }

    public void setRoom_cate_id(Integer room_cate_id) {
        this.room_cate_id = room_cate_id;
    }

    public String getRoom_cate_name() {
        return room_cate_name;
    }

    public void setRoom_cate_name(String room_cate_name) {
        this.room_cate_name = room_cate_name;
    }

    public String getRoom_cate_description() {
        return room_cate_description;
    }

    public void setRoom_cate_description(String room_cate_description) {
        this.room_cate_description = room_cate_description;
    }

    public Integer getRoom_cate_amount() {
        return room_cate_amount;
    }

    public void setRoom_cate_amount(Integer room_cate_amount) {
        this.room_cate_amount = room_cate_amount;
    }

    @Override
    public String toString() {
        return "RoomCategoryEntity{" + "room_cate_id=" + room_cate_id + ", room_cate_name=" + room_cate_name + ", room_cate_description=" + room_cate_description + ", room_cate_amount=" + room_cate_amount + '}';
    }

    
    
    
}
