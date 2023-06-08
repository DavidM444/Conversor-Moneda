/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvMonedasClaa;

/**
 *
 * @author pc
 */
public class Dl {

   
    Double Dolar(double amount, String toCuerrency) {
        
        
        switch (toCuerrency) {
            case "EUR":
                amount = amount*1.07; 
                break;
            case "GBP":
                amount *=0.86;
                
                break;
            case "JPY":
                amount *=139.90;
                
                break;
            case "CAD":
                amount *=1.34;
                
                break;
        }
        return amount;
    }

    

   
    
}
