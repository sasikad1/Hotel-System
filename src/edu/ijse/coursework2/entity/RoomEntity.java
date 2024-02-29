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
@Table(name="Room")
public class RoomEntity {
    @Id
    @Column(name="room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    
    @Column(name="roo_category", nullable = false,length = 30)
    private String roomCategory;
    
    @Column(name="room_description", nullable = false,length = 50)
    private String roomDescription;

    public RoomEntity(String roomCategory, String roomDescription) {
        this.roomCategory = roomCategory;
        this.roomDescription = roomDescription;
    }
    
    
    
}
