package com.states.texas.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String[][] getDataFromExcel(String file, String sheetname) throws IOException {

		String path = System.getProperty("user.dir") + "//src//test//resources//testdata//";
		File objFile = new File(path + file);
		FileInputStream fis = new FileInputStream(objFile);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet objSheet = wb.getSheet(sheetname);
		int rowLength = objSheet.getLastRowNum();// Return 3
		int colounmLenght = objSheet.getRow(0).getLastCellNum(); // Return 2

		String[][] data = new String[rowLength][colounmLenght];
		String value = "";
		for (int i = 1; i <= rowLength; i++) {

			Row objRow = objSheet.getRow(i);

			for (int j = 1; j < colounmLenght; j++) {

				value = objRow.getCell(j).getStringCellValue();
				data[i - 1][j - 1] = value;
				// System.out.println(data[i-1][j-1]);
			}
		}

		return data;

	}

	
	  /*public static void main(String[] args) throws IOException{
		  getKeywordDrivenDataFromExcel("keyWordDriven.xlsx", "TC01"); }*/
	 

	public static Object[][] getKeywordDrivenDataFromExcel(String file, String sheetname) throws IOException {

		String path = System.getProperty("user.dir") + "//src//test//resources//testdata//";
		File objFile = new File(path + file);
		FileInputStream fis = new FileInputStream(objFile);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet objSheet = wb.getSheet(sheetname);
		int rowLength = objSheet.getLastRowNum();// Return 5
		int colounmLenght = objSheet.getRow(0).getLastCellNum(); // Return 5

		Object[][] data = new String[rowLength][colounmLenght];
		String value = "";
		for (int i = 1; i <= rowLength; i++) {

			Row objRow = objSheet.getRow(i);

			for (int j = 1; j < colounmLenght; j++) {

				value = objRow.getCell(j, Row.CREATE_NULL_AS_BLANK).toString();
				data[i - 1][j - 1] = value;
				//System.out.println(data[i-1][j-1]);
			}
		}

		return data;

	}

}
