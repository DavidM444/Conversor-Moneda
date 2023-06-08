/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvMonedasClaa;

/**
 *
 * @author pc
 */
class Cad {

    double DolarC(double amount, String toCurrency) {
         switch (toCurrency) {
            case "USD":
                amount = amount*0.75; 
                break;
            case "EUR":
                amount *=0.70;
                
                break;
            case "GBP":
                amount *=0.60;
                
                break;
            case "JPY":
                amount *=104.71;
                
                break;
        }
        return amount;
    }
    
}
