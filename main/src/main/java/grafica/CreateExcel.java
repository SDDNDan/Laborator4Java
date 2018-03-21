package grafica;

import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {
    File fileName = new File("C:/Users/Dan/Desktop/Fund.xlsx");

    public static void createWorkbook(File fileName) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("fund");

            XSSFRow row = sheet.createRow(0);
            XSSFCell cell0 = row.createCell(0);
            cell0.setCellValue("Nav Value");

            XSSFCell cell1 = row.createCell(1);

            cell1.setCellValue("Amount Change");

            XSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("Percent Change");

            workbook.write(fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
