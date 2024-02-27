/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dto;

/**
 *
 * @author sasik
 */
public class RoomCategoryDto {
    private Integer room_cate_id;
    private String room_cate_name;
    private String room_cate_description;

    public RoomCategoryDto() {
    }

    public RoomCategoryDto(Integer room_cate_id, String room_cate_name, String room_cate_description) {
        this.room_cate_id = room_cate_id;
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
    }

    public RoomCategoryDto(String room_cate_name, String room_cate_description) {
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
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

    @Override
    public String toString() {
        return "RoomCategoryDto{" + "room_cate_id=" + room_cate_id + ", room_cate_name=" + room_cate_name + ", room_cate_description=" + room_cate_description + '}';
    }
    
    
}
