package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelreader {
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("C:\\Users\\MeesalaVineelSai\\IdeaProjects\\SecreProject\\src\\test\\resources\\excelReader\\ExcelTestdata.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    XSSFWorkbook workbook;

    {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    XSSFSheet sheet = workbook.getSheetAt(0);
    Sheet guru99Sheet = workbook.getSheet("Login");



    public String username(int i) throws IOException {
    	
        Row row = sheet.getRow(i);
        Cell cell = row.getCell(0);
        String cellval = cell.getStringCellValue();
        return cellval;

    }
    public String password(int i) throws IOException {

        Row row = sheet.getRow(i);
        Cell cell = row.getCell(1);
        String cellval = cell.getStringCellValue();
        return cellval;

    }
    public int totalCell(){
        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
        return rowCount;

    }
}
