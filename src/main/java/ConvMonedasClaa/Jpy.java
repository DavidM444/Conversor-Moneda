/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvMonedasClaa;

/**
 *
 * @author pc
 */
class Jpy {

    double Yen(double amount, String toCurrency) {
         switch (toCurrency) {
            case "USD":
                amount = amount*0.0071; 
                break;
            case "EUR":
                amount *=0.0067;
                
                break;
            case "GBP":
                amount *=0.0057;
                
                break;
            case "CAD":
                amount *=0.0095;                
                break;
        }
        return amount;
    }
    
}
