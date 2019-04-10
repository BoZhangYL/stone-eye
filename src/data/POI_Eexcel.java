package data;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;

import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POI_Eexcel {
	public static void POIReadExcel() throws IOException{
		  String fileName = "c:\\name.xls";
			HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(fileName));
			System.out.println("Datadump:\n");
			for(int k = 0;k<wb.getNumberOfSheets();k++)
			{
		             HSSFSheet sheet = wb.getSheetAt(k);
		             int rows = sheet.getPhysicalNumberOfRows();
		             System.out.println("Sheet" + k +" \"" +wb.getSheetName(k) + "\" has" + rows
		                    + "row(s).");
		             for (int r = 0; r < rows; r++)
		             {
		                 HSSFRow row = sheet.getRow(r);
		                 if (row ==null) {
		                    continue;
		                 }
		                 int cells = row.getPhysicalNumberOfCells();
		                 System.out.println("\nROW" + row.getRowNum() +" has " + cells
		                        + "cell(s).");
		                 for (int c = 0; c < cells; c++)
		                 {
		                   ;		                 }
		}
	  }
}
}