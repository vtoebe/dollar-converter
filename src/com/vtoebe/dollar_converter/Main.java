package com.vtoebe.dollar_converter;

import com.vtoebe.dollar_converter.service.ContinuityChecker;
import com.vtoebe.dollar_converter.service.Converter;
import com.vtoebe.dollar_converter.utils.Printer;
import com.vtoebe.dollar_converter.utils.Writer;

public class Main {
    public static void main(String[] args){

        ContinuityChecker cont = new ContinuityChecker();
        Printer print = new Printer();
        Writer write = new Writer();
        Converter convert = new Converter();

        do{
            print.result(write.convertedValue(
                    convert.convert(
                            write.saveUSD(print.inputUSD()),
                            write.saveBRL(print.inputBRL())
                    )
            ));
        } while (cont.check());

    }


}
