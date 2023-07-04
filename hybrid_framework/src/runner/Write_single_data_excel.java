package runner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_single_data_excel {

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
				Workbook book = WorkbookFactory.create(fis);
				Sheet sh = book.getSheet("Sheet3");
				Row r = sh.createRow(5);
				Cell c = r.createCell(3);
				c.setCellValue("ABCD");
				FileOutputStream fos=new FileOutputStream("./excel/testdata.xlsx");
				book.write(fos);
				
			}

		}
