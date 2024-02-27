/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.coursework2.edu;

import edu.ijse.coursework2.utill.SessionFactoryConfiguration;
import edu.ijse.coursework2.view.AdminLoginView;
import org.hibernate.Session;

/**
 *
 * @author sasik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AdminLoginView().setVisible(true);
        
        Session session = SessionFactoryConfiguration.getInstance().getSession();
    }
    
}
