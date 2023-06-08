/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alura.conversiondemoneda.init;

import com.alura.conversiondemoneda.view.CurrencyConverter;
import javax.swing.JFrame;

/**
 *
 * @author David Muñoz
 */
public class ConversionDeMoneda {

    public static void main(String[] args) {
        CurrencyConverter inci= new CurrencyConverter();
        inci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inci.setVisible(true);
        
    }
}
