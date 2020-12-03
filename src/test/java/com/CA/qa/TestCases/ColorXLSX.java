package com.CA.qa.TestCases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColorXLSX {
	public static void main(String[] args) throws IOException {
	    Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Color Test");
	    Row row = sheet.createRow(1);

	    CellStyle style = workbook.createCellStyle();
//	    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//	    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
	    Font font = workbook.createFont();
            font.setColor(IndexedColors.RED.getIndex());
            style.setFont(font);
        
	    Cell cell1 = row.createCell(0);
	    cell1.setCellValue("33");
	    cell1.setCellStyle(style);
	    
	    Cell cell2 = row.createCell(1);
	    cell2.setCellValue("ivr");
	    cell2.setCellStyle(style);

	    FileOutputStream fos =new FileOutputStream(new File("/home/santosh/Documents/cp.xlsx"));
	    workbook.write(fos);
	    fos.close();
	    System.out.println("Done");
	}


}
