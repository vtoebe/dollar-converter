package com.vtoebe.dollar_converter.service;

import com.vtoebe.dollar_converter.utils.Printer;

public class ContinuityChecker {
    Printer print = new Printer();

    public boolean check(){ return print.continueCheck() == 0; }
}
