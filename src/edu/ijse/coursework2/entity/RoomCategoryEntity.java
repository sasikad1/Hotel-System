/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework2.entity;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Entity;

/**
 *
 * @author sasik
 */
@javax.persistence.Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="RoomCategory")
public class RoomCategoryEntity {
    private Integer room_cate_id;
    private String room_cate_name;
    private String room_cate_description;
    private Integer room_cate_amount;

    public RoomCategoryEntity(String room_cate_name, String room_cate_description, Integer room_cate_amount) {
        this.room_cate_name = room_cate_name;
        this.room_cate_description = room_cate_description;
        this.room_cate_amount = room_cate_amount;
    }
}
