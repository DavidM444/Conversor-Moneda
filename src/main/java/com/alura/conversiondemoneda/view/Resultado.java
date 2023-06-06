/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.view;

import java.awt.Container;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Resultado extends JFrame{

 
    private JLabel txtResult, resLabel;
    private DefaultTableModel modelo;
    
    private void cargarCampoResult(Container container){
        txtResult = new JLabel("El resultado es: ");
        resLabel= new JLabel();
        
        container.add(txtResult);
        container.add(resLabel);
       
    }
    


    public Resultado(CurrencyConverter cc) {
        super("Resultado");

        

        Container container = getContentPane();
        setLayout(null);txtResult = new JLabel("El resultado es: ");
        resLabel= new JLabel();
        
        cargarCampoResult(container);

   
       
        setSize(100, 50);
        setVisible(true);
        setLocationRelativeTo(cc);
    }
     public static void cargarResultado(double convertedAmount) {
         DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(amount) + " " + fromCurrency + " = " +
                decimalFormat.format(convertedAmount) + " " + toCurrency;

       //crear el resultLbl para mostrar el resultado en este
       //resLabel.setText(result);
        System.out.println(convertedAmount);
    }
     
  
}
