/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.view;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Error extends JFrame{

    
    private  JLabel lblError;

    public Error(CurrencyConverter cc) {
        super("Entrada incorrecta");
        Container container = getContentPane();
        getContentPane().setBackground(Color.cyan);
     
        setLayout(null);
      
        lblError = new JLabel("");
        lblError.setBounds(20, 10,200 ,20 );
        container.add(lblError);
        setSize(200, 100);
        setBounds(100, 60,200,100);
        setVisible(true);
        
        
        
    }
    
    public static void Err(String txt) {
        String i = txt+ " No es valido!";
        CurrencyConverter cc = new CurrencyConverter();
        Error error = new Error(cc);
        error.lblError.setText(i);
        
    }

}
