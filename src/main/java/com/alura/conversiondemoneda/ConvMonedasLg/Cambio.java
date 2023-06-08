/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.ConvMonedasLg;

/**
 *
 * @author pc
 */
public class Cambio {

    public static Double cambiar(double amount, String fromCurrency, String toCurrency) {
        

        Dl dl = new Dl();
        Eur eur = new Eur();
        Gbp gbp = new Gbp();
        Jpy jpy = new Jpy();
        Cad cad = new Cad();

        switch (fromCurrency) {
            case ("USD"):
                amount = dl.Dolar(amount, toCurrency);
                break;
            case ("EUR"):
                amount = eur.Euro(amount, toCurrency);
                break;

            case ("GBP"):
                amount = gbp.LibraEst(amount, toCurrency);
                break;

            case ("JPY"):
                amount = jpy.Yen(amount, toCurrency);
                break;

            case ("CAD"):
                amount = cad.DolarC(amount, toCurrency);
                break;

        }

        return amount;
    }

}
