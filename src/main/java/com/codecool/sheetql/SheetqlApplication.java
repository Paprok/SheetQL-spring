package com.codecool.sheetql;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@SpringBootApplication
public class SheetqlApplication {
    public static void main(String... args) throws IOException, GeneralSecurityException {
        List<List<Object>> values = new SheetsReader().getSheetLists("15NxaIMfWdj-0uIejGGWBSLPia2_iLN0TxJvKTxhjM_o", "Arkusz1!A1:B");
    }
}

