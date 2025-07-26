package com.akfi.excelwriter;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ExcelWriterService {

    private static final String FILE_NAME = "AKFI_Players.xlsx";

    public void writePlayer(Player player) throws IOException {
        Workbook workbook;
        Sheet sheet;
        File file = new File(FILE_NAME);

        if (file.exists()) {
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheetAt(0);
        } else {
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet("Players");

            Row header = sheet.createRow(0);
            String[] columns = {"Name", "Father Name", "Aadhaar", "Email", "Mobile1", "Mobile2",
                    "Address", "State", "Pin", "Blood Group", "DOB"};
            for (int i = 0; i < columns.length; i++) {
                header.createCell(i).setCellValue(columns[i]);
            }
        }

        int lastRow = sheet.getLastRowNum() + 1;
        Row row = sheet.createRow(lastRow);

        row.createCell(0).setCellValue(player.getName());
        row.createCell(1).setCellValue(player.getFatherName());
        row.createCell(2).setCellValue(player.getAadhaar());
        row.createCell(3).setCellValue(player.getEmail());
        row.createCell(4).setCellValue(player.getMobile1());
        row.createCell(5).setCellValue(player.getMobile2());
        row.createCell(6).setCellValue(player.getAddress());
        row.createCell(7).setCellValue(player.getState());
        row.createCell(8).setCellValue(player.getPin());
        row.createCell(9).setCellValue(player.getBloodGroup());
        row.createCell(10).setCellValue(player.getDob());

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}
