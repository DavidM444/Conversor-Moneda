/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alura.conversiondemoneda;

import com.alura.conversiondemoneda.view.CurrencyConverter;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class ConversionDeMoneda {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CurrencyConverter inci= new CurrencyConverter();
        inci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inci.setVisible(true);
        
    }
}
