/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.ConvMonedasLg;

/**
 *
 * @author pc
 */
class Gbp {

    double LibraEst(double amount, String toCurrency) {
        switch (toCurrency) {
            case "USD":
                amount = amount * 1.24;
                break;
            case "EUR":
                amount *= 1.16;

                break;
            case "JPY":
                amount *= 174.15;

                break;
            case "CAD":
                amount *= 1.66;

                break;
        }
        return amount;
    }

}
