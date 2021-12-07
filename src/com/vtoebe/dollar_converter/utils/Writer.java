package com.vtoebe.dollar_converter.utils;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Writer {
    private float usd;
    private float brl;

    Locale usa = new Locale("en", "US");
    Locale br = new Locale("pt-br", "BR");

    Currency usdCurr = Currency.getInstance(usa);
    Currency brlCurr = Currency.getInstance(br);

    public float saveUSD(String inputUSD){
        return usd = Float.parseFloat(inputUSD);
    }

    public float saveBRL(String inputBRL){
        return brl = Float.parseFloat(inputBRL);
    }

    public String convertedValue(float convertedValue){
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        NumberFormat brlFormat = NumberFormat.getCurrencyInstance(br);

        String result = ("Quotation: " + usdCurr.getDisplayName() + " : " + dollarFormat.format(usd) + "\n" +
                         brlCurr.getDisplayName() + " | " + brlFormat.format(brl) +
                         " = " +
                         dollarFormat.format(convertedValue) + " | " + usdCurr.getDisplayName()
        );
        return result;
    }
}
