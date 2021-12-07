package com.vtoebe.dollar_converter.utils;

import javax.swing.*;

public class Printer {
    final String CONTINUE_LINE = "Would you like to continue?";
    final String USD_REQUEST = "What's today's dollar quotation? ";
    final String BRL_REQUEST = "Type the value in BRL that you'd like to convert to USD:";

    public String inputUSD(){ return JOptionPane.showInputDialog(null, USD_REQUEST, "Dollar Quotation", JOptionPane.INFORMATION_MESSAGE); }
    public String inputBRL(){ return JOptionPane.showInputDialog(null, BRL_REQUEST, "BRL to Convert", JOptionPane.INFORMATION_MESSAGE); }
    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
    public void result(String conversionResult){
        JOptionPane.showMessageDialog(null, conversionResult, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
