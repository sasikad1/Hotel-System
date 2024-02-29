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
@Table(name="RoomCategory")
public class RoomCategoryEntity {
    @Id
    @Column(name="room_cate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer room_cate_id;
    
    @Column(name="room_cate_name", nullable = false,length = 30)
    private String room_cate_name;
    
    @Column(name="room_cate_description", nullable = false,length = 50)
    private String room_cate_description;
    
    @Column(name="room_cate_amount", nullable = false,length = 30)
    private Integer room_cate_amount;

    public RoomCategoryEntity(String room_cate_name, String room_cate_description, Integer room_cate_amount) {
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
        this.room_cate_amount = room_cate_amount;
    }
    
    
}
