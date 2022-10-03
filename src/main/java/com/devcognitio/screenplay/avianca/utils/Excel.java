package com.devcognitio.screenplay.avianca.utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel {

    public static List<String> getInfoExcel() throws IOException {
        File src = new File("src/test/resources/files/alimentador.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);

        int rowcount = sheet1.getLastRowNum();

        List<String> listaDatos = new ArrayList<>();

        for (int i = 0; i <= rowcount; i++) {

            String data0 = new DataFormatter().formatCellValue(sheet1.getRow(i).getCell(0));
            listaDatos.add(data0);
        }
        System.out.println("resultado es:" + listaDatos.get(0));
        wb.close();
        return listaDatos;
    }
}
