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
@Table(name="Package")
public class PackageEntity {
    @Id
    @Column(name="pack_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pack_id;
    
    @Column(name="pack_name", nullable = false,length = 30)
    private String pack_name;
    
    @Column(name="pack_amount", nullable = false,length = 20)
    private String pack_amount;

    public PackageEntity(String pack_name, String pack_amount) {
        this.pack_name = pack_name;
        this.pack_amount = pack_amount;
    }
    
    
}
