/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversiondemoneda.view;

/**
 *
 * @author pc
 */
import com.alura.conversiondemoneda.ConvMonedasLg.Cambio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame {

    private JLabel lblAmount;
    private JLabel lblFromCurrency;
    private JLabel lblToCurrency;
    private JTextField txtAmount;
    private JComboBox<String> cmbFromCurrency;
    private JComboBox<String> cmbToCurrency;
    private JButton btnConvert;
    private JLabel lblResult;

    private static final String[] CURRENCIES = {"USD", "EUR", "GBP", "JPY", "CAD"};

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 200);
        getContentPane().setBackground(Color.YELLOW);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        lblAmount = new JLabel("Amount:");
        txtAmount = new JTextField(10);
        lblFromCurrency = new JLabel("From:");
        cmbFromCurrency = new JComboBox<>(CURRENCIES);
        lblToCurrency = new JLabel("To:");
        cmbToCurrency = new JComboBox<>(CURRENCIES);
        btnConvert = new JButton("Convert");
        lblResult = new JLabel("");

        add(lblAmount);
        add(txtAmount);
        add(lblFromCurrency);
        add(cmbFromCurrency);
        add(lblToCurrency);
        add(cmbToCurrency);
        add(btnConvert);
        add(lblResult);

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean validacion = validarNumero(txtAmount.getText());
                if (validacion == true) {
                    abrirResult();
                } else {
                    Error.Err(txtAmount.getText());
                    limpiar();

                }

            }
        });
    }

    private void abrirResult() {

        new Resultado(this);

        double amount = Double.parseDouble(txtAmount.getText());
        String fromCurrency = cmbFromCurrency.getSelectedItem().toString();
        String toCurrency = cmbToCurrency.getSelectedItem().toString();

        
        Double amount2 = Cambio.cambiar(amount,fromCurrency,toCurrency);
        Resultado.cargarResultado(amount2, fromCurrency, toCurrency);

    }

    private static boolean validarNumero(String numero) {
        try {
            Double.parseDouble(numero);
            return true;

        } catch (NumberFormatException e) {
        }
        return false;

    }
    private void limpiar(){
        txtAmount.setText("");
    }

}
