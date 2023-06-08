/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.ConvMonedasLg;

/**
 *
 * @author pc
 */
class Eur {

    Double Euro(double amount, String toCurrency) {
          switch (toCurrency) {
            case "USD":
                amount = amount*0.93; 
                break;
            case "GBP":
                amount *=0.80;
                
                break;
            case "JPY":
                amount *=140.03;
                
                break;
            case "CAD":
                amount *=1.34;
                
                break;
        }
        return amount;
    }
    
}
