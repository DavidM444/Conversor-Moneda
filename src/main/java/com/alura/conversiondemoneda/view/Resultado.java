/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.view;

import java.awt.Color;
import java.awt.Container;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author pc
 */
public class Resultado extends JFrame {

    private static JLabel txtResult, resLabel;

    public Resultado(CurrencyConverter cc) {
        super("Resultado");

        Container container = getContentPane();
        getContentPane().setBackground(Color.GREEN);
        setLayout(null);
        txtResult = new JLabel("El resultado es: ");
        resLabel = new JLabel("");

        txtResult.setBounds(10, 10, 300, 20);
        txtResult.setBackground(Color.red);
        resLabel.setBounds(100, 10, 100, 20);
        container.add(txtResult);

        container.add(resLabel); 
        setSize(200, 100);
        setVisible(true);
        setLocationRelativeTo(cc);
        
    }

    public static void cargarResultado(double convertedAmount, String fromCurrency, String toCurrency) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(convertedAmount) + " " + toCurrency;
        
        resLabel.setText(result);

    }

}
