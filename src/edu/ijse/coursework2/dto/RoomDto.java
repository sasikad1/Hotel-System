/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.dto;

import javax.persistence.Column;

/**
 *
 * @author sasik
 */
public class RoomDto {

    private Integer roomId;
    private String roomCategory;
    private String roomDescription;

    public RoomDto() {
    }

    public RoomDto(Integer roomId, String roomCategory, String roomDescription) {
        this.roomId = roomId;
        this.roomCategory = roomCategory;
        this.roomDescription = roomDescription;
    }

    public RoomDto(String roomCategory, String roomDescription) {
        this.roomCategory = roomCategory;
        this.roomDescription = roomDescription;
    }
    
    
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Override
    public String toString() {
        return "RoomDto{" + "roomId=" + roomId + ", roomCategory=" + roomCategory + ", roomDescription=" + roomDescription + '}';
    }
}
